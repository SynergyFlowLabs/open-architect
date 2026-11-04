package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.b2;
import com.google.vr.sdk.deps.c2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c2<MessageType extends b2<MessageType, BuilderType>, BuilderType extends c2<MessageType, BuilderType>> implements u4 {
    protected static z5 e(t4 t4Var) {
        return new z5();
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public abstract BuilderType clone();

    protected abstract BuilderType c(MessageType messagetype);

    @Override // com.google.vr.sdk.deps.u4
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BuilderType Ik(t4 t4Var) {
        if (g1().getClass().isInstance(t4Var)) {
            return (BuilderType) c((b2) t4Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
