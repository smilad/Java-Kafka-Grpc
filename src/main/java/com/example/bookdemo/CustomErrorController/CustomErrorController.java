package com.example.bookdemo.CustomErrorController;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> handleError(HttpServletRequest request) {
        // Get the status code of the error
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());
            httpStatus = HttpStatus.valueOf(statusCode);
        }

        // Create a map to hold the error details
        Map<String, Object> errorDetails = new HashMap<>();
        errorDetails.put("status", httpStatus.value());
        errorDetails.put("error", httpStatus.getReasonPhrase());
        errorDetails.put("details", httpStatus.series());
        // Check if there are any validation errors
        List<FieldError> fieldErrors = (List<FieldError>) request.getAttribute("errors");
        if (fieldErrors != null && !fieldErrors.isEmpty()) {
            // Add the validation errors to the error details map
            List<Map<String, String>> errors = new ArrayList<>();
            for (FieldError fieldError : fieldErrors) {
                Map<String, String> error = new HashMap<>();
                error.put("field", fieldError.getField());
                error.put("message", fieldError.getDefaultMessage());
                errors.add(error);
            }
            errorDetails.put("errors", errors);
        }
        // Return the error details as a JSON response
        return new ResponseEntity<>(errorDetails, httpStatus);
    }


}
