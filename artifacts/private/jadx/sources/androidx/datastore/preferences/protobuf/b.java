package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<MessageType extends q2> implements h3<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v0 f50001a = v0.d();

    private MessageType A(MessageType message) throws t1 {
        if (message == null || message.Z()) {
            return message;
        }
        throw B(message).a().l(message);
    }

    private q4 B(MessageType message) {
        return message instanceof a ? ((a) message).s2() : new q4(message);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType g(InputStream inputStream) throws t1 {
        return (MessageType) s(inputStream, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType s(InputStream inputStream, v0 v0Var) throws t1 {
        return (MessageType) A(q(inputStream, v0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType o(u uVar) throws t1 {
        return (MessageType) u(uVar, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType u(u uVar, v0 v0Var) throws t1 {
        return (MessageType) A(w(uVar, v0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType z(z zVar) throws t1 {
        return (MessageType) m(zVar, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType m(z zVar, v0 v0Var) throws t1 {
        return (MessageType) A(r(zVar, v0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType d(InputStream inputStream) throws t1 {
        return (MessageType) t(inputStream, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType t(InputStream inputStream, v0 v0Var) throws t1 {
        return (MessageType) A(x(inputStream, v0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType f(ByteBuffer byteBuffer) throws t1 {
        return (MessageType) y(byteBuffer, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType y(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        z zVarO = z.o(byteBuffer);
        MessageType messagetypeR = r(zVarO, v0Var);
        try {
            zVarO.a(0);
            return (MessageType) A(messagetypeR);
        } catch (t1 e10) {
            throw e10.l(messagetypeR);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws t1 {
        return (MessageType) j(bArr, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType e(byte[] bArr, int i10, int i11) throws t1 {
        return (MessageType) v(bArr, i10, i11, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType v(byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
        return (MessageType) A(n(bArr, i10, i11, v0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType j(byte[] bArr, v0 v0Var) throws t1 {
        return (MessageType) v(bArr, 0, bArr.length, v0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream) throws t1 {
        return (MessageType) q(inputStream, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType q(InputStream inputStream, v0 v0Var) throws t1 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) x(new a.AbstractC0443a.C0444a(inputStream, z.P(i10, inputStream)), v0Var);
        } catch (IOException e10) {
            throw new t1(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType p(u uVar) throws t1 {
        return (MessageType) w(uVar, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType w(u data, v0 extensionRegistry) throws t1 {
        z zVarV = data.V();
        MessageType messagetypeR = r(zVarV, extensionRegistry);
        try {
            zVarV.a(0);
            return messagetypeR;
        } catch (t1 e10) {
            throw e10.l(messagetypeR);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType l(z input) throws t1 {
        return r(input, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType h(InputStream inputStream) throws t1 {
        return (MessageType) x(inputStream, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType x(InputStream input, v0 extensionRegistry) throws t1 {
        z zVarK = z.k(input);
        MessageType messagetypeR = r(zVarK, extensionRegistry);
        try {
            zVarK.a(0);
            return messagetypeR;
        } catch (t1 e10) {
            throw e10.l(messagetypeR);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType b(byte[] bArr) throws t1 {
        return (MessageType) n(bArr, 0, bArr.length, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType i(byte[] bArr, int i10, int i11) throws t1 {
        return (MessageType) n(bArr, i10, i11, f50001a);
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: Z */
    public MessageType n(byte[] data, int off, int len, v0 extensionRegistry) throws t1 {
        z zVarR = z.r(data, off, len);
        MessageType messagetypeR = r(zVarR, extensionRegistry);
        try {
            zVarR.a(0);
            return messagetypeR;
        } catch (t1 e10) {
            throw e10.l(messagetypeR);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h3
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType k(byte[] bArr, v0 v0Var) throws t1 {
        return (MessageType) n(bArr, 0, bArr.length, v0Var);
    }
}
