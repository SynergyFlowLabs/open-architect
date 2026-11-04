package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.b1;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
class g extends e {
    private static final Charset C = Charset.forName("UTF-16");
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private int A;
    int B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataInputStream f76012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DataOutputStream f76013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private DataInputStream f76014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DataOutputStream f76015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b f76016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f76017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f76018z;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f76020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataOutputStream f76021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f76022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DataOutputStream f76023d;

        b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f76020a = byteArrayOutputStream;
            this.f76021b = new DataOutputStream(byteArrayOutputStream);
            this.f76022c = i10;
            this.f76023d = dataOutputStream;
        }

        void a() throws IOException {
            this.f76021b.flush();
            int size = this.f76020a.size();
            this.f76023d.writeInt((this.f76022c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f76023d.writeInt(size);
            }
            this.f76020a.writeTo(this.f76023d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private void o1(int i10, String str, Bundle bundle) {
        switch (i10) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i10);
        }
    }

    private void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.e
    public void C0(double d10) {
        try {
            this.f76015w.writeDouble(d10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public boolean F(int i10) {
        while (true) {
            try {
                int i11 = this.A;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f76018z;
                int i13 = this.B;
                if (i12 < i13) {
                    this.f76012t.skip(i13 - i12);
                }
                this.B = -1;
                int i14 = this.f76012t.readInt();
                this.f76018z = 0;
                int i15 = i14 & 65535;
                if (i15 == 65535) {
                    i15 = this.f76012t.readInt();
                }
                this.A = (i14 >> 16) & 65535;
                this.B = i15;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.e
    public float G() {
        try {
            return this.f76014v.readFloat();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void H0(float f10) {
        try {
            this.f76015w.writeFloat(f10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public int L() {
        try {
            return this.f76014v.readInt();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void L0(int i10) {
        try {
            this.f76015w.writeInt(i10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public long Q() {
        try {
            return this.f76014v.readLong();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void Q0(long j10) {
        try {
            this.f76015w.writeLong(j10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void W0(Parcelable parcelable) {
        if (!this.f76017y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public void a() {
        b bVar = this.f76016x;
        if (bVar != null) {
            try {
                if (bVar.f76020a.size() != 0) {
                    this.f76016x.a();
                }
                this.f76016x = null;
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        }
    }

    @Override // androidx.versionedparcelable.e
    protected e c() {
        return new g(this.f76014v, this.f76015w, this.f76001a, this.f76002b, this.f76003c);
    }

    @Override // androidx.versionedparcelable.e
    public String c0() {
        try {
            int i10 = this.f76014v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f76014v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void e1(String str) {
        try {
            if (str == null) {
                this.f76015w.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(C);
            this.f76015w.writeInt(bytes.length);
            this.f76015w.write(bytes);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void g1(IBinder iBinder) {
        if (!this.f76017y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.e
    public void i0(int i10) {
        a();
        b bVar = new b(i10, this.f76013u);
        this.f76016x = bVar;
        this.f76015w = bVar.f76021b;
    }

    @Override // androidx.versionedparcelable.e
    public void i1(IInterface iInterface) {
        if (!this.f76017y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public void j0(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f76017y = z11;
    }

    @Override // androidx.versionedparcelable.e
    public boolean l() {
        try {
            return this.f76014v.readBoolean();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void m0(boolean z10) {
        try {
            this.f76015w.writeBoolean(z10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public Bundle p() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < iL; i10++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.e
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f76015w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f76015w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public byte[] s() {
        try {
            int i10 = this.f76014v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f76014v.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void t0(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f76015w.writeInt(-1);
            } else {
                this.f76015w.writeInt(bArr.length);
                this.f76015w.write(bArr);
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void v0(byte[] bArr, int i10, int i11) {
        try {
            if (bArr == null) {
                this.f76015w.writeInt(-1);
            } else {
                this.f76015w.writeInt(i11);
                this.f76015w.write(bArr, i10, i11);
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    public double y() {
        try {
            return this.f76014v.readDouble();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected void y0(CharSequence charSequence) {
        if (!this.f76017y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    private g(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f76018z = 0;
        this.A = -1;
        this.B = -1;
        int i10 = 5 >> 0;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f76012t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f76013u = dataOutputStream;
        this.f76014v = dataInputStream;
        this.f76015w = dataOutputStream;
    }

    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 != -1 && gVar.f76018z >= i10) {
                throw new IOException();
            }
            int i11 = super.read();
            g.this.f76018z++;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 != -1 && gVar.f76018z >= i10) {
                throw new IOException();
            }
            long jSkip = super.skip(j10);
            if (jSkip > 0) {
                g.this.f76018z += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            g gVar = g.this;
            int i12 = gVar.B;
            if (i12 != -1 && gVar.f76018z >= i12) {
                throw new IOException();
            }
            int i13 = super.read(bArr, i10, i11);
            if (i13 > 0) {
                g.this.f76018z += i13;
            }
            return i13;
        }
    }
}
