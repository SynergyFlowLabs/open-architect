package com.sun.jna;

import com.rabbitmq.client.k0;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    private static final long serialVersionUID = 1;
    private Number number;
    private int size;
    private boolean unsigned;
    private long value;

    public IntegerType(int i10) {
        this(i10, 0L, false);
    }

    public static final int compare(long j10, long j11) {
        if (j10 == j11) {
            return 0;
        }
        return j10 < j11 ? -1 : 1;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntegerType) || !this.number.equals(((IntegerType) obj).number)) {
            return false;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long jLongValue = obj == null ? 0L : ((Number) obj).longValue();
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(jLongValue);
        return integerType;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    public void setValue(long j10) {
        long j11;
        this.value = j10;
        int i10 = this.size;
        if (i10 == 1) {
            if (this.unsigned) {
                this.value = 255 & j10;
            }
            byte b10 = (byte) j10;
            j11 = b10;
            this.number = Byte.valueOf(b10);
        } else if (i10 == 2) {
            if (this.unsigned) {
                this.value = g.f334653t & j10;
            }
            short s10 = (short) j10;
            j11 = s10;
            this.number = Short.valueOf(s10);
        } else if (i10 == 4) {
            if (this.unsigned) {
                this.value = k0.f265952a & j10;
            }
            int i11 = (int) j10;
            j11 = i11;
            this.number = Integer.valueOf(i11);
        } else {
            if (i10 != 8) {
                throw new IllegalArgumentException("Unsupported size: " + this.size);
            }
            this.number = Long.valueOf(j10);
            j11 = j10;
        }
        int i12 = this.size;
        if (i12 < 8) {
            long j12 = ~((1 << (i12 * 8)) - 1);
            if ((j10 < 0 && j11 != j10) || (j10 >= 0 && (j12 & j10) != 0)) {
                throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(j10) + " exceeds native capacity (" + this.size + " bytes) mask=0x" + Long.toHexString(j12));
            }
        }
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public String toString() {
        return this.number.toString();
    }

    public IntegerType(int i10, boolean z10) {
        this(i10, 0L, z10);
    }

    public static <T extends IntegerType> int compare(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return 1;
        }
        if (t11 == null) {
            return -1;
        }
        return compare(t10.longValue(), t11.longValue());
    }

    public IntegerType(int i10, long j10) {
        this(i10, j10, false);
    }

    public static int compare(IntegerType integerType, long j10) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j10);
    }

    public IntegerType(int i10, long j10, boolean z10) {
        this.size = i10;
        this.unsigned = z10;
        setValue(j10);
    }
}
