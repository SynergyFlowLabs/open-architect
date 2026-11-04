package ca;

import ca.a;

/* JADX INFO: loaded from: classes4.dex */
public interface h<BigType extends ca.a<BigType>> {

    public static final class a {
        public static /* synthetic */ byte a(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: byteValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.N(z10);
        }

        public static /* synthetic */ double b(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doubleValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.f0(z10);
        }

        public static /* synthetic */ float c(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: floatValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.b(z10);
        }

        public static /* synthetic */ int d(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.U(z10);
        }

        public static /* synthetic */ long e(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: longValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.S(z10);
        }

        public static /* synthetic */ short f(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shortValue");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.R(z10);
        }

        public static /* synthetic */ byte g(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ubyteValue-Wa3L5BU");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.W(z10);
        }

        public static /* synthetic */ int h(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uintValue-OGnWXxg");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.q0(z10);
        }

        public static /* synthetic */ long i(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ulongValue-I7RO_PI");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.w(z10);
        }

        public static /* synthetic */ short j(h hVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ushortValue-BwKQO78");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return hVar.O(z10);
        }
    }

    byte N(boolean z10);

    short O(boolean z10);

    short R(boolean z10);

    long S(boolean z10);

    int U(boolean z10);

    byte W(boolean z10);

    float b(boolean z10);

    double f0(boolean z10);

    int q0(boolean z10);

    long w(boolean z10);
}
