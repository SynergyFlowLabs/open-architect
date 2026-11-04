package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "DataHolderCreator", validate = true)
@KeepName
@g6.a
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<DataHolder> CREATOR = new q();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f106365k = new n(new String[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1000)
    final int f106366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getColumns", id = 1)
    private final String[] f106367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bundle f106368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWindows", id = 2)
    private final CursorWindow[] f106369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusCode", id = 3)
    private final int f106370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMetadata", id = 4)
    @p0
    private final Bundle f106371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f106372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f106373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f106374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106375j;

    @g6.a
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f106376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f106377b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f106378c = new HashMap();

        /* synthetic */ a(String[] strArr, String str, p pVar) {
            this.f106376a = (String[]) w.r(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        @g6.a
        public DataHolder a(int i10) {
            return new DataHolder(this, i10);
        }

        @NonNull
        @g6.a
        public DataHolder b(int i10, @NonNull Bundle bundle) {
            return new DataHolder(this, i10, bundle);
        }

        @NonNull
        @g6.a
        public a c(@NonNull ContentValues contentValues) {
            com.google.android.gms.common.internal.d.c(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return d(map);
        }

        @NonNull
        public a d(@NonNull HashMap map) {
            com.google.android.gms.common.internal.d.c(map);
            this.f106377b.add(map);
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @g6.a
    public static a O1(@NonNull String[] strArr) {
        return new a(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @g6.a
    public static DataHolder T1(int i10) {
        return new DataHolder(f106365k, i10, (Bundle) null);
    }

    private final void h3(String str, int i10) {
        Bundle bundle = this.f106368c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.f106373h) {
            throw new CursorIndexOutOfBoundsException(i10, this.f106373h);
        }
    }

    private static CursorWindow[] k3(a aVar, int i10) {
        if (aVar.f106376a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = aVar.f106377b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.f106376a.length);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(aVar.f106376a.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i11);
                int i12 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i12 >= aVar.f106376a.length) {
                        z10 = zPutDouble ? false : true;
                        i11++;
                    } else if (zPutDouble) {
                        String str = aVar.f106376a[i12];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i11, i12);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i11, i12);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i11, i12);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i11, i12);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i11, i12);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i11, i12);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i11, i12);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i11, i12);
                        }
                        i12++;
                    }
                    if (z10) {
                        throw new o("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(aVar.f106376a.length);
                    arrayList2.add(cursorWindow);
                    i11--;
                    i11++;
                }
            } catch (RuntimeException e10) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((CursorWindow) arrayList2.get(i13)).close();
                }
                throw e10;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    public final double B2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getDouble(i10, this.f106368c.getInt(str));
    }

    public final float D2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getFloat(i10, this.f106368c.getInt(str));
    }

    public final void U2(@NonNull String str, int i10, int i11, @NonNull CharArrayBuffer charArrayBuffer) {
        h3(str, i10);
        this.f106369d[i11].copyStringToBuffer(i10, this.f106368c.getInt(str), charArrayBuffer);
    }

    public final void W2() {
        this.f106368c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f106367b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f106368c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f106372g = new int[this.f106369d.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f106369d;
            if (i10 >= cursorWindowArr.length) {
                this.f106373h = numRows;
                return;
            }
            this.f106372g[i10] = numRows;
            numRows += this.f106369d[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @g6.a
    public boolean b2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getLong(i10, this.f106368c.getInt(str)) == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @g6.a
    public void close() {
        synchronized (this) {
            try {
                if (!this.f106374i) {
                    this.f106374i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f106369d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @g6.a
    public byte[] e2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getBlob(i10, this.f106368c.getInt(str));
    }

    @g6.a
    public int f2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getInt(i10, this.f106368c.getInt(str));
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f106375j && this.f106369d.length > 0 && !isClosed()) {
                close();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @g6.a
    public int getCount() {
        return this.f106373h;
    }

    @g6.a
    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            try {
                z10 = this.f106374i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @g6.a
    public long n2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getLong(i10, this.f106368c.getInt(str));
    }

    @g6.a
    public int p2() {
        return this.f106370e;
    }

    @NonNull
    @g6.a
    public String q2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].getString(i10, this.f106368c.getInt(str));
    }

    @g6.a
    public int s2(int i10) {
        int length;
        int i11 = 0;
        w.x(i10 >= 0 && i10 < this.f106373h);
        while (true) {
            int[] iArr = this.f106372g;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    @g6.a
    public boolean u2(@NonNull String str) {
        return this.f106368c.containsKey(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String[] strArr = this.f106367b;
        int iA = i6.b.a(parcel);
        i6.b.Z(parcel, 1, strArr, false);
        i6.b.c0(parcel, 2, this.f106369d, i10, false);
        i6.b.F(parcel, 3, p2());
        i6.b.k(parcel, 4, z(), false);
        i6.b.F(parcel, 1000, this.f106366a);
        i6.b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    @p0
    @g6.a
    public Bundle z() {
        return this.f106371f;
    }

    @g6.a
    public boolean z2(@NonNull String str, int i10, int i11) {
        h3(str, i10);
        return this.f106369d[i11].isNull(i10, this.f106368c.getInt(str));
    }

    @SafeParcelable.b
    DataHolder(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) String[] strArr, @SafeParcelable.e(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) @p0 Bundle bundle) {
        this.f106374i = false;
        this.f106375j = true;
        this.f106366a = i10;
        this.f106367b = strArr;
        this.f106369d = cursorWindowArr;
        this.f106370e = i11;
        this.f106371f = bundle;
    }

    @g6.a
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i10, @p0 Bundle bundle) {
        this.f106374i = false;
        this.f106375j = true;
        this.f106366a = 1;
        this.f106367b = (String[]) w.r(strArr);
        this.f106369d = (CursorWindow[]) w.r(cursorWindowArr);
        this.f106370e = i10;
        this.f106371f = bundle;
        W2();
    }

    public DataHolder(@NonNull Cursor cursor, int i10, @p0 Bundle bundle) {
        int startPosition;
        j6.a aVar = new j6.a(cursor);
        String[] columnNames = aVar.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = aVar.getCount();
            CursorWindow window = aVar.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                aVar.a(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && aVar.moveToPosition(startPosition)) {
                CursorWindow window2 = aVar.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    aVar.a(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    aVar.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            aVar.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i10, bundle);
        } catch (Throwable th2) {
            aVar.close();
            throw th2;
        }
    }

    private DataHolder(a aVar, int i10, @p0 Bundle bundle) {
        this(aVar.f106376a, k3(aVar, -1), i10, (Bundle) null);
    }
}
