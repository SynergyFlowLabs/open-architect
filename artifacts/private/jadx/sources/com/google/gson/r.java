package com.google.gson;

import com.google.gson.internal.e0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f125558a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f125558a = bool;
    }

    private static boolean N(r rVar) {
        Object obj = rVar.f125558a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.l
    public long A() {
        return O() ? B().longValue() : Long.parseLong(D());
    }

    @Override // com.google.gson.l
    public Number B() {
        Object obj = this.f125558a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.b0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.l
    public short C() {
        return O() ? B().shortValue() : Short.parseShort(D());
    }

    @Override // com.google.gson.l
    public String D() {
        Object obj = this.f125558a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (O()) {
            return B().toString();
        }
        if (M()) {
            return ((Boolean) this.f125558a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f125558a.getClass());
    }

    @Override // com.google.gson.l
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public r c() {
        return this;
    }

    public boolean M() {
        return this.f125558a instanceof Boolean;
    }

    public boolean O() {
        return this.f125558a instanceof Number;
    }

    public boolean P() {
        return this.f125558a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f125558a == null) {
                return rVar.f125558a == null;
            }
            if (N(this) && N(rVar)) {
                if ((this.f125558a instanceof BigInteger) || (rVar.f125558a instanceof BigInteger)) {
                    return k().equals(rVar.k());
                }
                return B().longValue() == rVar.B().longValue();
            }
            Object obj2 = this.f125558a;
            if (obj2 instanceof Number) {
                Object obj3 = rVar.f125558a;
                if (obj3 instanceof Number) {
                    if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                        return i().compareTo(rVar.i()) == 0;
                    }
                    double dP = p();
                    double dP2 = rVar.p();
                    return dP == dP2 || (Double.isNaN(dP) && Double.isNaN(dP2));
                }
            }
            return obj2.equals(rVar.f125558a);
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f125558a == null) {
            return 31;
        }
        if (N(this)) {
            jDoubleToLongBits = B().longValue();
        } else {
            Object obj = this.f125558a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(B().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.l
    public BigDecimal i() {
        Object obj = this.f125558a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : e0.b(D());
    }

    @Override // com.google.gson.l
    public BigInteger k() {
        Object obj = this.f125558a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return N(this) ? BigInteger.valueOf(B().longValue()) : e0.c(D());
    }

    @Override // com.google.gson.l
    public boolean l() {
        return M() ? ((Boolean) this.f125558a).booleanValue() : Boolean.parseBoolean(D());
    }

    @Override // com.google.gson.l
    public byte m() {
        return O() ? B().byteValue() : Byte.parseByte(D());
    }

    @Override // com.google.gson.l
    @Deprecated
    public char n() {
        String strD = D();
        if (strD.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return strD.charAt(0);
    }

    @Override // com.google.gson.l
    public double p() {
        return O() ? B().doubleValue() : Double.parseDouble(D());
    }

    @Override // com.google.gson.l
    public float r() {
        return O() ? B().floatValue() : Float.parseFloat(D());
    }

    @Override // com.google.gson.l
    public int s() {
        return O() ? B().intValue() : Integer.parseInt(D());
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f125558a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f125558a = str;
    }

    public r(Character ch2) {
        Objects.requireNonNull(ch2);
        this.f125558a = ch2.toString();
    }
}
