package com.mymagazine.config;

import com.mymagazine.bean.ResponseResult;
import com.mymagazine.exception.TipException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@CrossOrigin
//@RestControllerAdvice
public class MagazineRestExceptionHandler {
    /*
    private static Logger LOGGER = LoggerFactory.getLogger(MagazineRestExceptionHandler.class);
    */
    /*@ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response){
        ex.printStackTrace();

        if(ex instanceof MissingServletRequestParameterException){
            return new ResponseResult(400, ex.getMessage(), null);
        }
        if(ex instanceof TipException){

            LOGGER.error("======="+ex.getMessage()+"=======");
            return new ResponseResult(401, "found no data in parameter", null);

        }

        return new ResponseResult(500, ex.getMessage(), null);

    }*/

}