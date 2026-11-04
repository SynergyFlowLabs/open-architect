package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.a7;
import com.google.android.gms.internal.play_billing.e7;

/* JADX INFO: loaded from: classes4.dex */
public class a7<MessageType extends e7<MessageType, BuilderType>, BuilderType extends a7<MessageType, BuilderType>> extends m5<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7 f109041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e7 f109042b;

    protected a7(MessageType messagetype) {
        this.f109041a = messagetype;
        if (messagetype.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f109042b = messagetype.r();
    }

    private static void j(Object obj, Object obj2) {
        p8.a().b(obj.getClass()).f(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.i8
    public final boolean b() {
        return e7.B(this.f109042b, false);
    }

    @Override // com.google.android.gms.internal.play_billing.i8
    public final /* bridge */ /* synthetic */ h8 f() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.m5
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a7 h() {
        a7 a7Var = (a7) this.f109041a.m(5, null, null);
        a7Var.f109042b = R();
        return a7Var;
    }

    public final a7 l(e7 e7Var) {
        if (!this.f109041a.equals(e7Var)) {
            if (!this.f109042b.j()) {
                q();
            }
            j(this.f109042b, e7Var);
        }
        return this;
    }

    public final MessageType n() {
        MessageType messagetype = (MessageType) R();
        if (e7.B(messagetype, true)) {
            return messagetype;
        }
        throw new e9(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.g8
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public MessageType R() {
        if (!this.f109042b.j()) {
            return (MessageType) this.f109042b;
        }
        this.f109042b.x();
        return (MessageType) this.f109042b;
    }

    protected final void p() {
        if (this.f109042b.j()) {
            return;
        }
        q();
    }

    protected void q() {
        e7 e7VarR = this.f109041a.r();
        j(e7VarR, this.f109042b);
        this.f109042b = e7VarR;
    }
}
