package com.planner5d.library.services.exceptions;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes10.dex */
@r
@e
@s("javax.inject.Singleton")
public final class ErrorMessageParser_Factory implements h<ErrorMessageParser> {
    private final c<Application> applicationProvider;
    private final c<NetworkErrorUtility> networkErrorUtilityProvider;

    public ErrorMessageParser_Factory(c<Application> cVar, c<NetworkErrorUtility> cVar2) {
        this.applicationProvider = cVar;
        this.networkErrorUtilityProvider = cVar2;
    }

    public static ErrorMessageParser_Factory create(c<Application> cVar, c<NetworkErrorUtility> cVar2) {
        return new ErrorMessageParser_Factory(cVar, cVar2);
    }

    public static ErrorMessageParser newInstance(Application application, NetworkErrorUtility networkErrorUtility) {
        return new ErrorMessageParser(application, networkErrorUtility);
    }

    @Override // ij.c
    public ErrorMessageParser get() {
        return newInstance(this.applicationProvider.get(), this.networkErrorUtilityProvider.get());
    }
}
