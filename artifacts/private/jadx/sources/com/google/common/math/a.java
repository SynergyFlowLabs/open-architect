package com.google.common.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
@com.google.common.annotations.d
public class a {

    /* JADX INFO: renamed from: com.google.common.math.a$a, reason: collision with other inner class name */
    private static class C1106a extends p<BigDecimal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1106a f119385a = new C1106a();

        private C1106a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(BigDecimal a10, BigDecimal b10) {
            return a10.subtract(b10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(double d10, RoundingMode mode) {
            return new BigDecimal(d10);
        }
    }

    private a() {
    }

    public static double a(BigDecimal x10, RoundingMode mode) {
        return C1106a.f119385a.b(x10, mode);
    }
}
