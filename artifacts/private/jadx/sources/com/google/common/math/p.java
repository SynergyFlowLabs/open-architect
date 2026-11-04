package com.google.common.math;

import com.google.common.base.j0;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
abstract class p<X extends Number & Comparable<X>> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119464a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f119464a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119464a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119464a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119464a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119464a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f119464a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f119464a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f119464a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    p() {
    }

    abstract X a(X a10, X b10);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    final double b(X x10, RoundingMode mode) {
        Number numberE;
        int iCompareTo;
        int[] iArr;
        double dF;
        Number numberE2;
        double dNextUp;
        int iCompareTo2;
        int i10;
        boolean z10;
        j0.F(x10, "x");
        j0.F(mode, "mode");
        double dC = c(x10);
        if (Double.isInfinite(dC)) {
            switch (a.f119464a[mode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) d(x10)) * Double.MAX_VALUE;
                case 5:
                    return dC == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dC == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    break;
                case 8:
                    throw new ArithmeticException(x10 + " cannot be represented precisely as a double");
                default:
                    numberE = e(dC, RoundingMode.UNNECESSARY);
                    iCompareTo = ((Comparable) x10).compareTo(numberE);
                    iArr = a.f119464a;
                    switch (iArr[mode.ordinal()]) {
                        case 1:
                            if (d(x10) >= 0) {
                                if (iCompareTo < 0) {
                                    return d.f(dC);
                                }
                            } else if (iCompareTo > 0) {
                                return Math.nextUp(dC);
                            }
                        case 2:
                        case 3:
                        case 4:
                            if (iCompareTo >= 0) {
                                dNextUp = Math.nextUp(dC);
                                if (dNextUp != Double.POSITIVE_INFINITY) {
                                    numberE2 = e(dNextUp, RoundingMode.CEILING);
                                    iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i10 = iArr[mode.ordinal()];
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 == 4) {
                                                        throw new AssertionError("impossible");
                                                    }
                                                    if (d(x10) >= 0) {
                                                    }
                                                } else if (d(x10) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dC;
                                }
                            } else {
                                dF = d.f(dC);
                                if (dF != Double.NEGATIVE_INFINITY) {
                                    Number numberE3 = e(dF, RoundingMode.FLOOR);
                                    numberE2 = numberE;
                                    numberE = numberE3;
                                    dNextUp = dC;
                                    dC = dF;
                                    iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i10 = iArr[mode.ordinal()];
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 == 4) {
                                                        throw new AssertionError("impossible");
                                                    }
                                                    if (d(x10) >= 0) {
                                                    }
                                                } else if (d(x10) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dC;
                                }
                            }
                        case 5:
                            if (iCompareTo < 0) {
                                return d.f(dC);
                            }
                            break;
                        case 6:
                            if (iCompareTo > 0) {
                                return Math.nextUp(dC);
                            }
                            break;
                        case 7:
                            if (d(x10) >= 0) {
                                if (iCompareTo > 0) {
                                    return Math.nextUp(dC);
                                }
                            } else if (iCompareTo < 0) {
                                return d.f(dC);
                            }
                        case 8:
                            if (iCompareTo == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i.k(z10);
                            return dC;
                        default:
                            throw new AssertionError("impossible");
                    }
                    break;
            }
        } else {
            numberE = e(dC, RoundingMode.UNNECESSARY);
            iCompareTo = ((Comparable) x10).compareTo(numberE);
            iArr = a.f119464a;
            switch (iArr[mode.ordinal()]) {
                case 1:
                    if (d(x10) >= 0) {
                        if (iCompareTo < 0) {
                            return d.f(dC);
                        }
                    } else if (iCompareTo > 0) {
                        return Math.nextUp(dC);
                    }
                case 2:
                case 3:
                case 4:
                    if (iCompareTo >= 0) {
                        dNextUp = Math.nextUp(dC);
                        if (dNextUp != Double.POSITIVE_INFINITY) {
                            numberE2 = e(dNextUp, RoundingMode.CEILING);
                            iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i10 = iArr[mode.ordinal()];
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4) {
                                                throw new AssertionError("impossible");
                                            }
                                            if (d(x10) >= 0) {
                                            }
                                        } else if (d(x10) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dC;
                        }
                    } else {
                        dF = d.f(dC);
                        if (dF != Double.NEGATIVE_INFINITY) {
                            Number numberE4 = e(dF, RoundingMode.FLOOR);
                            numberE2 = numberE;
                            numberE = numberE4;
                            dNextUp = dC;
                            dC = dF;
                            iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i10 = iArr[mode.ordinal()];
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4) {
                                                throw new AssertionError("impossible");
                                            }
                                            if (d(x10) >= 0) {
                                            }
                                        } else if (d(x10) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dC;
                        }
                    }
                case 5:
                    if (iCompareTo < 0) {
                        return d.f(dC);
                    }
                    break;
                case 6:
                    if (iCompareTo > 0) {
                        return Math.nextUp(dC);
                    }
                    break;
                case 7:
                    if (d(x10) >= 0) {
                        if (iCompareTo > 0) {
                            return Math.nextUp(dC);
                        }
                    } else if (iCompareTo < 0) {
                        return d.f(dC);
                    }
                case 8:
                    if (iCompareTo == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i.k(z10);
                    return dC;
                default:
                    throw new AssertionError("impossible");
            }
        }
        return dC;
    }

    abstract double c(X x10);

    abstract int d(X x10);

    abstract X e(double d10, RoundingMode mode);
}
