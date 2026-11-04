package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface f extends AutoCloseable {
    static f W0(ByteBuffer byteBuffer, a options) {
        return TensorFlowLite.b(options == null ? null : options.g()).W0(byteBuffer, options);
    }

    static f n1(File modelFile, a options) {
        return TensorFlowLite.b(options == null ? null : options.g()).n1(modelFile, options);
    }

    int Ic(String opName);

    void Pc(int idx, int[] dims, boolean strict);

    int U6();

    void aa(Object input, Object output);

    void ae(int idx, int[] dims);

    @Override // java.lang.AutoCloseable
    void close();

    void d4(Object[] inputs, Map<Integer, Object> outputs);

    int h2(String opName);

    Long kb();

    l kf(int outputIndex);

    void p7();

    int pd();

    l w5(int inputIndex);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        EnumC2445a f339805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f339806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Boolean f339807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f339808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Boolean f339809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        an.a f339810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final List<c> f339811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<d> f339812h;

        /* JADX INFO: renamed from: org.tensorflow.lite.f$a$a, reason: collision with other inner class name */
        public enum EnumC2445a {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public a() {
            this.f339805a = EnumC2445a.FROM_APPLICATION_ONLY;
            this.f339806b = -1;
            this.f339811g = new ArrayList();
            this.f339812h = new ArrayList();
        }

        public a a(c delegate) {
            this.f339811g.add(delegate);
            return this;
        }

        public a b(d delegateFactory) {
            this.f339812h.add(delegateFactory);
            return this;
        }

        public an.a c() {
            return this.f339810f;
        }

        public List<d> d() {
            return Collections.unmodifiableList(this.f339812h);
        }

        public List<c> e() {
            return Collections.unmodifiableList(this.f339811g);
        }

        public int f() {
            return this.f339806b;
        }

        public EnumC2445a g() {
            return this.f339805a;
        }

        public boolean h() {
            Boolean bool = this.f339807c;
            return bool != null && bool.booleanValue();
        }

        public boolean i() {
            Boolean bool = this.f339808d;
            return bool == null || bool.booleanValue();
        }

        public boolean j() {
            Boolean bool = this.f339809e;
            return bool != null && bool.booleanValue();
        }

        public a k(an.a config) {
            this.f339810f = config;
            return this;
        }

        public a l(boolean allow) {
            this.f339809e = Boolean.valueOf(allow);
            return this;
        }

        public a m(int numThreads) {
            this.f339806b = numThreads;
            return this;
        }

        public a n(EnumC2445a runtime) {
            this.f339805a = runtime;
            return this;
        }

        public a o(boolean useNNAPI) {
            this.f339807c = Boolean.valueOf(useNNAPI);
            return this;
        }

        public a p(boolean useXNNPACK) {
            this.f339808d = Boolean.valueOf(useXNNPACK);
            return this;
        }

        public a(a other) {
            this.f339805a = EnumC2445a.FROM_APPLICATION_ONLY;
            this.f339806b = -1;
            this.f339806b = other.f339806b;
            this.f339807c = other.f339807c;
            this.f339809e = other.f339809e;
            this.f339811g = new ArrayList(other.f339811g);
            this.f339812h = new ArrayList(other.f339812h);
            this.f339805a = other.f339805a;
            this.f339810f = other.f339810f;
            this.f339808d = other.f339808d;
        }
    }
}
