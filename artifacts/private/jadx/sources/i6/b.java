package i6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    private b() {
    }

    public static void A(@NonNull Parcel parcel, int i10, @NonNull SparseArray<Float> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeFloat(sparseArray.valueAt(i11).floatValue());
        }
        g0(parcel, iF0);
    }

    public static void B(@NonNull Parcel parcel, int i10, @NonNull IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            g0(parcel, iF0);
        }
    }

    public static void C(@NonNull Parcel parcel, int i10, @NonNull IBinder[] iBinderArr, boolean z10) {
        if (iBinderArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBinderArray(iBinderArr);
            g0(parcel, iF0);
        }
    }

    public static void D(@NonNull Parcel parcel, int i10, @NonNull List<IBinder> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBinderList(list);
            g0(parcel, iF0);
        }
    }

    public static void E(@NonNull Parcel parcel, int i10, @NonNull SparseArray<IBinder> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeStrongBinder(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void F(@NonNull Parcel parcel, int i10, int i11) {
        h0(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void G(@NonNull Parcel parcel, int i10, @NonNull int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeIntArray(iArr);
            g0(parcel, iF0);
        }
    }

    public static void H(@NonNull Parcel parcel, int i10, @NonNull List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        g0(parcel, iF0);
    }

    public static void I(@NonNull Parcel parcel, int i10, @NonNull Integer num, boolean z10) {
        if (num != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void J(@NonNull Parcel parcel, int i10, @NonNull List list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeList(list);
            g0(parcel, iF0);
        }
    }

    public static void K(@NonNull Parcel parcel, int i10, long j10) {
        h0(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void L(@NonNull Parcel parcel, int i10, @NonNull long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeLongArray(jArr);
            g0(parcel, iF0);
        }
    }

    public static void M(@NonNull Parcel parcel, int i10, @NonNull List<Long> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeLong(list.get(i11).longValue());
        }
        g0(parcel, iF0);
    }

    public static void N(@NonNull Parcel parcel, int i10, @NonNull Long l10, boolean z10) {
        if (l10 != null) {
            h0(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void O(@NonNull Parcel parcel, int i10, @NonNull Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            g0(parcel, iF0);
        }
    }

    public static void P(@NonNull Parcel parcel, int i10, @NonNull Parcel[] parcelArr, boolean z10) {
        if (parcelArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void Q(@NonNull Parcel parcel, int i10, @NonNull List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcel parcel2 = list.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void R(@NonNull Parcel parcel, int i10, @NonNull SparseArray<Parcel> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            Parcel parcelValueAt = sparseArray.valueAt(i11);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void S(@NonNull Parcel parcel, int i10, @NonNull Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            g0(parcel, iF0);
        }
    }

    public static void T(@NonNull Parcel parcel, int i10, @NonNull PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            g0(parcel, iF0);
        }
    }

    public static void U(@NonNull Parcel parcel, int i10, short s10) {
        h0(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    public static void V(@NonNull Parcel parcel, int i10, @NonNull SparseBooleanArray sparseBooleanArray, boolean z10) {
        if (sparseBooleanArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            g0(parcel, iF0);
        }
    }

    public static void W(@NonNull Parcel parcel, int i10, @NonNull SparseIntArray sparseIntArray, boolean z10) {
        if (sparseIntArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseIntArray.keyAt(i11));
            parcel.writeInt(sparseIntArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void X(@NonNull Parcel parcel, int i10, @NonNull SparseLongArray sparseLongArray, boolean z10) {
        if (sparseLongArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseLongArray.keyAt(i11));
            parcel.writeLong(sparseLongArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void Y(@NonNull Parcel parcel, int i10, @NonNull String str, boolean z10) {
        if (str == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeString(str);
            g0(parcel, iF0);
        }
    }

    public static void Z(@NonNull Parcel parcel, int i10, @NonNull String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStringArray(strArr);
            g0(parcel, iF0);
        }
    }

    public static int a(@NonNull Parcel parcel) {
        return f0(parcel, 20293);
    }

    public static void a0(@NonNull Parcel parcel, int i10, @NonNull List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStringList(list);
            g0(parcel, iF0);
        }
    }

    public static void b(@NonNull Parcel parcel, int i10) {
        g0(parcel, i10);
    }

    public static void b0(@NonNull Parcel parcel, int i10, @NonNull SparseArray<String> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeString(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void c(@NonNull Parcel parcel, int i10, @NonNull BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                int i11 = 6 | 0;
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        g0(parcel, iF0);
    }

    public static <T extends Parcelable> void c0(@NonNull Parcel parcel, int i10, @NonNull T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t10, i11);
            }
        }
        g0(parcel, iF0);
    }

    public static void d(@NonNull Parcel parcel, int i10, @NonNull BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        g0(parcel, iF0);
    }

    public static <T extends Parcelable> void d0(@NonNull Parcel parcel, int i10, @NonNull List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t10, 0);
            }
        }
        g0(parcel, iF0);
    }

    public static void e(@NonNull Parcel parcel, int i10, @NonNull BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            g0(parcel, iF0);
        }
    }

    public static <T extends Parcelable> void e0(@NonNull Parcel parcel, int i10, @NonNull SparseArray<T> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            T tValueAt = sparseArray.valueAt(i11);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, tValueAt, 0);
            }
        }
        g0(parcel, iF0);
    }

    public static void f(@NonNull Parcel parcel, int i10, @NonNull BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        g0(parcel, iF0);
    }

    private static int f0(Parcel parcel, int i10) {
        parcel.writeInt(i10 | l1.a.f316127c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(@NonNull Parcel parcel, int i10, boolean z10) {
        h0(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    private static void g0(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void h(@NonNull Parcel parcel, int i10, @NonNull boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBooleanArray(zArr);
            g0(parcel, iF0);
        }
    }

    private static void h0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void i(@NonNull Parcel parcel, int i10, @NonNull List<Boolean> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).booleanValue() ? 1 : 0);
        }
        g0(parcel, iF0);
    }

    private static void i0(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void j(@NonNull Parcel parcel, int i10, @NonNull Boolean bool, boolean z10) {
        if (bool != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            if (z10) {
                boolean z11 = true;
                h0(parcel, i10, 0);
            }
        }
    }

    public static void k(@NonNull Parcel parcel, int i10, @NonNull Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBundle(bundle);
            g0(parcel, iF0);
        }
    }

    public static void l(@NonNull Parcel parcel, int i10, byte b10) {
        h0(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void m(@NonNull Parcel parcel, int i10, @NonNull byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeByteArray(bArr);
            g0(parcel, iF0);
        }
    }

    public static void n(@NonNull Parcel parcel, int i10, @NonNull byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        g0(parcel, iF0);
    }

    public static void o(@NonNull Parcel parcel, int i10, @NonNull SparseArray<byte[]> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeByteArray(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void p(@NonNull Parcel parcel, int i10, char c10) {
        h0(parcel, i10, 4);
        parcel.writeInt(c10);
    }

    public static void q(@NonNull Parcel parcel, int i10, @NonNull char[] cArr, boolean z10) {
        if (cArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeCharArray(cArr);
            g0(parcel, iF0);
        }
    }

    public static void r(@NonNull Parcel parcel, int i10, double d10) {
        h0(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void s(@NonNull Parcel parcel, int i10, @NonNull double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeDoubleArray(dArr);
            g0(parcel, iF0);
        }
    }

    public static void t(@NonNull Parcel parcel, int i10, @NonNull List<Double> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeDouble(list.get(i11).doubleValue());
        }
        g0(parcel, iF0);
    }

    public static void u(@NonNull Parcel parcel, int i10, @NonNull Double d10, boolean z10) {
        if (d10 == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            h0(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        }
    }

    public static void v(@NonNull Parcel parcel, int i10, @NonNull SparseArray<Double> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeDouble(sparseArray.valueAt(i11).doubleValue());
        }
        g0(parcel, iF0);
    }

    public static void w(@NonNull Parcel parcel, int i10, float f10) {
        h0(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void x(@NonNull Parcel parcel, int i10, @NonNull float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeFloatArray(fArr);
            g0(parcel, iF0);
        }
    }

    public static void y(@NonNull Parcel parcel, int i10, @NonNull List<Float> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeFloat(list.get(i11).floatValue());
        }
        g0(parcel, iF0);
    }

    public static void z(@NonNull Parcel parcel, int i10, @NonNull Float f10, boolean z10) {
        if (f10 != null) {
            h0(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }
}
