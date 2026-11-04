package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.qb;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class mb<MessageType extends qb<MessageType, BuilderType>, BuilderType extends mb<MessageType, BuilderType>> extends aa<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb f108681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected qb f108682b;

    protected mb(MessageType messagetype) {
        this.f108681a = messagetype;
        if (messagetype.k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f108682b = messagetype.m();
    }

    private static void l(Object obj, Object obj2) {
        gd.a().b(obj.getClass()).g(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean c() {
        return qb.C(this.f108682b, false);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final /* bridge */ /* synthetic */ yc d() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final /* bridge */ /* synthetic */ aa i(byte[] bArr, int i10, int i11) throws cc {
        int i12 = bb.f108300e;
        int i13 = gd.f108451d;
        t(bArr, 0, i11, bb.f108299d);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final /* bridge */ /* synthetic */ aa j(byte[] bArr, int i10, int i11, bb bbVar) throws cc {
        t(bArr, 0, i11, bbVar);
        return this;
    }

    protected final void n() {
        if (this.f108682b.k()) {
            return;
        }
        o();
    }

    protected void o() {
        qb qbVarM = this.f108681a.m();
        l(qbVarM, this.f108682b);
        this.f108682b = qbVarM;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final mb h() {
        mb mbVar = (mb) this.f108681a.D(5, null, null);
        mbVar.f108682b = Oc();
        return mbVar;
    }

    @Override // com.google.android.gms.internal.measurement.xc
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public MessageType Oc() {
        if (!this.f108682b.k()) {
            return (MessageType) this.f108682b;
        }
        this.f108682b.o();
        return (MessageType) this.f108682b;
    }

    public final MessageType r() {
        MessageType messagetype = (MessageType) Oc();
        if (messagetype.c()) {
            return messagetype;
        }
        throw new ud(messagetype);
    }

    public final mb s(qb qbVar) {
        if (!this.f108681a.equals(qbVar)) {
            if (!this.f108682b.k()) {
                o();
            }
            l(this.f108682b, qbVar);
        }
        return this;
    }

    public final mb t(byte[] bArr, int i10, int i11, bb bbVar) throws cc {
        if (!this.f108682b.k()) {
            o();
        }
        try {
            gd.a().b(this.f108682b.getClass()).i(this.f108682b, bArr, 0, i11, new fa(bbVar));
            return this;
        } catch (cc e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new cc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
