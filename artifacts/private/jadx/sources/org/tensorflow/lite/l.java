package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public interface l {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f339823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f339824b;

        public a(final float scale, final int zeroPoint) {
            this.f339823a = scale;
            this.f339824b = zeroPoint;
        }

        public float a() {
            return this.f339823a;
        }

        public int b() {
            return this.f339824b;
        }
    }

    ByteBuffer a();

    int[] b();

    int c();

    org.tensorflow.lite.a d();

    int e();

    a f();

    int g();

    int[] h();

    int index();

    String name();
}
