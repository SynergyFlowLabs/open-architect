package com.planner5d.library.services.exceptions;

import com.planner5d.library.services.utility.i1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes10.dex */
@r
@e
@s("javax.inject.Singleton")
public final class NetworkErrorUtility_Factory implements h<NetworkErrorUtility> {
    private final c<i1> internetStateMonitorProvider;

    public NetworkErrorUtility_Factory(c<i1> cVar) {
        this.internetStateMonitorProvider = cVar;
    }

    public static NetworkErrorUtility_Factory create(c<i1> cVar) {
        return new NetworkErrorUtility_Factory(cVar);
    }

    public static NetworkErrorUtility newInstance(i1 i1Var) {
        return new NetworkErrorUtility(i1Var);
    }

    @Override // ij.c
    public NetworkErrorUtility get() {
        return newInstance(this.internetStateMonitorProvider.get());
    }
}
