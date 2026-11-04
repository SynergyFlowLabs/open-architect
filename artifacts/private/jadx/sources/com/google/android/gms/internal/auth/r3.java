package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.r3;
import com.google.android.gms.internal.auth.t3;

/* JADX INFO: loaded from: classes4.dex */
public class r3<MessageType extends t3<MessageType, BuilderType>, BuilderType extends r3<MessageType, BuilderType>> extends m2<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f107783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected t3 f107784b;

    protected r3(MessageType messagetype) {
        this.f107783a = messagetype;
        if (messagetype.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f107784b = messagetype.c();
    }

    @Override // com.google.android.gms.internal.auth.m2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r3 clone() {
        r3 r3Var = (r3) this.f107783a.o(5, null, null);
        r3Var.f107784b = m();
        return r3Var;
    }

    @Override // com.google.android.gms.internal.auth.v4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MessageType m() {
        if (!this.f107784b.n()) {
            return (MessageType) this.f107784b;
        }
        this.f107784b.h();
        return (MessageType) this.f107784b;
    }

    @Override // com.google.android.gms.internal.auth.x4
    public final /* bridge */ /* synthetic */ w4 j() {
        throw null;
    }
}
