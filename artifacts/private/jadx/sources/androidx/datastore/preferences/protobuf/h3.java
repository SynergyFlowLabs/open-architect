package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface h3<MessageType> {
    MessageType a(byte[] data) throws t1;

    MessageType b(byte[] data) throws t1;

    MessageType c(InputStream input) throws t1;

    MessageType d(InputStream input) throws t1;

    MessageType e(byte[] data, int off, int len) throws t1;

    MessageType f(ByteBuffer data) throws t1;

    MessageType g(InputStream input) throws t1;

    MessageType h(InputStream input) throws t1;

    MessageType i(byte[] data, int off, int len) throws t1;

    MessageType j(byte[] data, v0 extensionRegistry) throws t1;

    MessageType k(byte[] data, v0 extensionRegistry) throws t1;

    MessageType l(z input) throws t1;

    MessageType m(z input, v0 extensionRegistry) throws t1;

    MessageType n(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

    MessageType o(u data) throws t1;

    MessageType p(u data) throws t1;

    MessageType q(InputStream input, v0 extensionRegistry) throws t1;

    MessageType r(z input, v0 extensionRegistry) throws t1;

    MessageType s(InputStream input, v0 extensionRegistry) throws t1;

    MessageType t(InputStream input, v0 extensionRegistry) throws t1;

    MessageType u(u data, v0 extensionRegistry) throws t1;

    MessageType v(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

    MessageType w(u data, v0 extensionRegistry) throws t1;

    MessageType x(InputStream input, v0 extensionRegistry) throws t1;

    MessageType y(ByteBuffer data, v0 extensionRegistry) throws t1;

    MessageType z(z input) throws t1;
}
