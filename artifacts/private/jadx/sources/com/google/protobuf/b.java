package com.google.protobuf;

import com.google.protobuf.n2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<MessageType extends n2> implements f3<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v0 f125761a = v0.d();

    private MessageType A(MessageType message) throws t1 {
        if (message == null || message.Z()) {
            return message;
        }
        throw B(message).a().l(message);
    }

    private n4 B(MessageType message) {
        return message instanceof a ? ((a) message).N5() : new n4(message);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType g(InputStream inputStream) throws t1 {
        return (MessageType) p(inputStream, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType p(InputStream inputStream, v0 v0Var) throws t1 {
        return (MessageType) A(z(inputStream, v0Var));
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType m(u uVar) throws t1 {
        return (MessageType) j(uVar, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType j(u uVar, v0 v0Var) throws t1 {
        return (MessageType) A(l(uVar, v0Var));
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType n(z zVar) throws t1 {
        return (MessageType) q(zVar, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType q(z zVar, v0 v0Var) throws t1 {
        return (MessageType) A(t(zVar, v0Var));
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType d(InputStream inputStream) throws t1 {
        return (MessageType) s(inputStream, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType s(InputStream inputStream, v0 v0Var) throws t1 {
        return (MessageType) A(r(inputStream, v0Var));
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType f(ByteBuffer byteBuffer) throws t1 {
        return (MessageType) u(byteBuffer, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType u(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        z zVarO = z.o(byteBuffer);
        MessageType messagetypeT = t(zVarO, v0Var);
        try {
            zVarO.a(0);
            return (MessageType) A(messagetypeT);
        } catch (t1 e10) {
            throw e10.l(messagetypeT);
        }
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws t1 {
        return (MessageType) w(bArr, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType e(byte[] bArr, int i10, int i11) throws t1 {
        return (MessageType) x(bArr, i10, i11, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType x(byte[] bArr, int i10, int i11, v0 v0Var) throws t1 {
        return (MessageType) A(y(bArr, i10, i11, v0Var));
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType w(byte[] bArr, v0 v0Var) throws t1 {
        return (MessageType) x(bArr, 0, bArr.length, v0Var);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream) throws t1 {
        return (MessageType) z(inputStream, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType z(InputStream inputStream, v0 v0Var) throws t1 {
        try {
            int i10 = inputStream.read();
            if (i10 != -1) {
                return (MessageType) r(new a.AbstractC1212a.C1213a(inputStream, z.P(i10, inputStream)), v0Var);
            }
            boolean z10 = false & false;
            return null;
        } catch (IOException e10) {
            throw new t1(e10);
        }
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType k(u uVar) throws t1 {
        return (MessageType) l(uVar, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType l(u data, v0 extensionRegistry) throws t1 {
        z zVarV = data.V();
        MessageType messagetypeT = t(zVarV, extensionRegistry);
        try {
            zVarV.a(0);
            return messagetypeT;
        } catch (t1 e10) {
            throw e10.l(messagetypeT);
        }
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType o(z input) throws t1 {
        return t(input, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType h(InputStream inputStream) throws t1 {
        return (MessageType) r(inputStream, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType r(InputStream input, v0 extensionRegistry) throws t1 {
        z zVarK = z.k(input);
        MessageType messagetypeT = t(zVarK, extensionRegistry);
        try {
            zVarK.a(0);
            return messagetypeT;
        } catch (t1 e10) {
            throw e10.l(messagetypeT);
        }
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType b(byte[] bArr) throws t1 {
        return (MessageType) y(bArr, 0, bArr.length, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType i(byte[] bArr, int i10, int i11) throws t1 {
        return (MessageType) y(bArr, i10, i11, f125761a);
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: Z */
    public MessageType y(byte[] data, int off, int len, v0 extensionRegistry) throws t1 {
        z zVarR = z.r(data, off, len);
        MessageType messagetypeT = t(zVarR, extensionRegistry);
        try {
            zVarR.a(0);
            return messagetypeT;
        } catch (t1 e10) {
            throw e10.l(messagetypeT);
        }
    }

    @Override // com.google.protobuf.f3
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType v(byte[] bArr, v0 v0Var) throws t1 {
        return (MessageType) y(bArr, 0, bArr.length, v0Var);
    }
}
