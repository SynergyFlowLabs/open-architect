package io.grpc.stub;

import io.grpc.stub.b;

/* JADX INFO: loaded from: classes13.dex */
@fj.c
@gj.d
public abstract class b<S extends b<S>> extends d<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f290895c = false;

    protected b(io.grpc.f fVar, io.grpc.e eVar) {
        super(fVar, eVar);
    }

    public static <T extends d<T>> T d(d.a<T> aVar, io.grpc.f fVar) {
        return (T) e(aVar, fVar, io.grpc.e.f288718k);
    }

    public static <T extends d<T>> T e(d.a<T> aVar, io.grpc.f fVar, io.grpc.e eVar) {
        return (T) aVar.a(fVar, eVar.u(g.f290901c, g.EnumC1987g.BLOCKING));
    }
}
