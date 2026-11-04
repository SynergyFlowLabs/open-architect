package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public interface f3<MessageType> {
    MessageType a(byte[] data) throws t1;

    MessageType b(byte[] data) throws t1;

    MessageType c(InputStream input) throws t1;

    MessageType d(InputStream input) throws t1;

    MessageType e(byte[] data, int off, int len) throws t1;

    MessageType f(ByteBuffer data) throws t1;

    MessageType g(InputStream input) throws t1;

    MessageType h(InputStream input) throws t1;

    MessageType i(byte[] data, int off, int len) throws t1;

    MessageType j(u data, v0 extensionRegistry) throws t1;

    MessageType k(u data) throws t1;

    MessageType l(u data, v0 extensionRegistry) throws t1;

    MessageType m(u data) throws t1;

    MessageType n(z input) throws t1;

    MessageType o(z input) throws t1;

    MessageType p(InputStream input, v0 extensionRegistry) throws t1;

    MessageType q(z input, v0 extensionRegistry) throws t1;

    MessageType r(InputStream input, v0 extensionRegistry) throws t1;

    MessageType s(InputStream input, v0 extensionRegistry) throws t1;

    MessageType t(z input, v0 extensionRegistry) throws t1;

    MessageType u(ByteBuffer data, v0 extensionRegistry) throws t1;

    MessageType v(byte[] data, v0 extensionRegistry) throws t1;

    MessageType w(byte[] data, v0 extensionRegistry) throws t1;

    MessageType x(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

    MessageType y(byte[] data, int off, int len, v0 extensionRegistry) throws t1;

    MessageType z(InputStream input, v0 extensionRegistry) throws t1;
}
