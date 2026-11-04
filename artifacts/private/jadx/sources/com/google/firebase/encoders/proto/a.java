package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f122028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f122029b = d.a.DEFAULT;

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    private static final class C1148a implements d {
        private final int U3;
        private final d.a V3;

        C1148a(int i10, d.a aVar) {
            this.U3 = i10;
            this.V3 = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.U3 == dVar.tag() && this.V3.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.U3) + (this.V3.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.d
        public d.a intEncoding() {
            return this.V3;
        }

        @Override // com.google.firebase.encoders.proto.d
        public int tag() {
            return this.U3;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.U3 + "intEncoding=" + this.V3 + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C1148a(this.f122028a, this.f122029b);
    }

    public a c(d.a aVar) {
        this.f122029b = aVar;
        return this;
    }

    public a d(int i10) {
        this.f122028a = i10;
        return this;
    }
}
