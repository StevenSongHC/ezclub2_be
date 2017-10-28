package me.steven.ezclub.misc.handler.exception;

import me.steven.ezclub.dto.ResponseData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData serverError(Exception e) {
        e.printStackTrace();
        return new ResponseData(false, 500, "internal server error", null);
    }

    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseBody
    public ResponseData urlNotFound() {
        return new ResponseData(false, 404, "url not found", null);
    }

}
