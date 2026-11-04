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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name */
    public static class C1923a extends RuntimeException {
        public C1923a(@NonNull String str, @NonNull Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private a() {
    }

    @NonNull
    public static ArrayList<Parcel> A(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            if (i13 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i13);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i13);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @NonNull
    public static SparseArray<Parcel> B(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i14);
                sparseArray.append(i13, parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i14);
            } else {
                sparseArray.append(i13, null);
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @NonNull
    public static <T extends Parcelable> T C(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG0);
        return tCreateFromParcel;
    }

    @NonNull
    public static SparseBooleanArray D(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseBooleanArray;
    }

    @NonNull
    public static SparseIntArray E(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseIntArray;
    }

    @NonNull
    public static SparseLongArray F(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseLongArray;
    }

    @NonNull
    public static String G(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iG0);
        return string;
    }

    @NonNull
    public static String[] H(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return strArrCreateStringArray;
    }

    @NonNull
    public static ArrayList<String> I(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateStringArrayList;
    }

    @NonNull
    public static SparseArray<String> J(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @NonNull
    public static <T> T[] K(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iG0);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> L(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateTypedArrayList;
    }

    @NonNull
    public static <T> SparseArray<T> M(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    public static void N(@NonNull Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new C1923a("Overread allowed size end=" + i10, parcel);
    }

    public static int O(int i10) {
        return (char) i10;
    }

    public static boolean P(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    public static Boolean Q(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte R(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static char S(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (char) parcel.readInt();
    }

    public static double T(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double U(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float V(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float W(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int X(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    public static IBinder Y(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iG0);
        return strongBinder;
    }

    public static int Z(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt();
    }

    @NonNull
    public static BigDecimal a(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iG0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    @NonNull
    public static Integer a0(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @NonNull
    public static BigDecimal[] b(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            int i11 = 6 & 0;
            return null;
        }
        int i12 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i13] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bigDecimalArr;
    }

    public static void b0(@NonNull Parcel parcel, int i10, @NonNull List list, @NonNull ClassLoader classLoader) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iG0);
    }

    @NonNull
    public static BigInteger c(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return new BigInteger(bArrCreateByteArray);
    }

    public static long c0(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readLong();
    }

    @NonNull
    public static BigInteger[] d(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bigIntegerArr;
    }

    @NonNull
    public static Long d0(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 8);
        return Long.valueOf(parcel.readLong());
    }

    @NonNull
    public static boolean[] e(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return zArrCreateBooleanArray;
    }

    @NonNull
    public static PendingIntent e0(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        PendingIntent pendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG0);
        return pendingIntentOrNullFromParcel;
    }

    @NonNull
    public static ArrayList<Boolean> f(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    public static short f0(@NonNull Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    @NonNull
    public static Bundle g(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iG0);
        return bundle;
    }

    public static int g0(@NonNull Parcel parcel, int i10) {
        return (i10 & l1.a.f316127c) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    @NonNull
    public static byte[] h(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return bArrCreateByteArray;
    }

    public static void h0(@NonNull Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + g0(parcel, i10));
    }

    @NonNull
    public static byte[][] i(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bArr;
    }

    public static int i0(@NonNull Parcel parcel) {
        int iX = X(parcel);
        int iG0 = g0(parcel, iX);
        int iO = O(iX);
        int iDataPosition = parcel.dataPosition();
        if (iO != 20293) {
            throw new C1923a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iX))), parcel);
        }
        int i10 = iG0 + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new C1923a("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    @NonNull
    public static SparseArray<byte[]> j(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    private static void j0(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new C1923a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    @NonNull
    public static char[] k(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return cArrCreateCharArray;
    }

    private static void k0(Parcel parcel, int i10, int i11) {
        int iG0 = g0(parcel, i10);
        if (iG0 == i11) {
            return;
        }
        throw new C1923a("Expected size " + i11 + " got " + iG0 + " (0x" + Integer.toHexString(iG0) + ")", parcel);
    }

    @NonNull
    public static double[] l(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return dArrCreateDoubleArray;
    }

    @NonNull
    public static ArrayList<Double> m(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @NonNull
    public static SparseArray<Double> n(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @NonNull
    public static float[] o(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return fArrCreateFloatArray;
    }

    @NonNull
    public static ArrayList<Float> p(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @NonNull
    public static SparseArray<Float> q(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @NonNull
    public static IBinder[] r(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return iBinderArrCreateBinderArray;
    }

    @NonNull
    public static ArrayList<IBinder> s(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateBinderArrayList;
    }

    @NonNull
    public static SparseArray<IBinder> t(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @NonNull
    public static int[] u(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return iArrCreateIntArray;
    }

    @NonNull
    public static ArrayList<Integer> v(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @NonNull
    public static long[] w(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return jArrCreateLongArray;
    }

    @NonNull
    public static ArrayList<Long> x(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @NonNull
    public static Parcel y(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iG0);
        parcel.setDataPosition(iDataPosition + iG0);
        return parcelObtain;
    }

    @NonNull
    public static Parcel[] z(@NonNull Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            if (i13 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i13);
                parcelArr[i12] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i13);
            } else {
                parcelArr[i12] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return parcelArr;
    }
}
