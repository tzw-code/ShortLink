package com.tangzw.shortlink.admin.common.convention.exception;

import com.tangzw.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.tangzw.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 远程服务调用异常类
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
