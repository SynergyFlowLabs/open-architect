package com.google.gson;

import com.google.gson.internal.j0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b0<T> {

    private final class b extends b0<T> {
        private b() {
        }

        @Override // com.google.gson.b0
        public T read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return (T) b0.this.read(aVar);
            }
            aVar.a7();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + b0.this + "]";
        }

        @Override // com.google.gson.b0
        public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
            if (t10 == null) {
                dVar.y();
            } else {
                b0.this.write(dVar, t10);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new com.google.gson.stream.a(reader));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new com.google.gson.internal.bind.g(lVar));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public final b0<T> nullSafe() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T read(com.google.gson.stream.a aVar) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new com.google.gson.stream.d(writer), t10);
    }

    public final l toJsonTree(T t10) {
        try {
            com.google.gson.internal.bind.h hVar = new com.google.gson.internal.bind.h();
            write(hVar, t10);
            return hVar.B0();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public abstract void write(com.google.gson.stream.d dVar, T t10) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            toJson(j0.c(sb2), t10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }
}
