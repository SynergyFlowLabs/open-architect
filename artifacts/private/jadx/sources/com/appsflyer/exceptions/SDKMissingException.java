package com.appsflyer.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class SDKMissingException extends IllegalStateException {
    public SDKMissingException() {
        super("AppsFlyer SDK required! Did you exclude the dependency from this library?");
    }
}
