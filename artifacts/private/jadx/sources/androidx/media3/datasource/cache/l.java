package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import com.google.common.collect.nb;
import com.google.common.collect.z6;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f62395g = "cached_content_index.exi";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f62396h = 10485760;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, k> f62397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f62398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f62399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f62400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f62401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c f62402f;

    private static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f62403e = "ExoPlayerCacheIndex";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f62404f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f62405g = "id";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f62407i = "metadata";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f62408j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f62409k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f62410l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f62411m = "id = ?";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f62413o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.database.b f62414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<k> f62415b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f62417d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f62406h = "key";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f62412n = {"id", f62406h, "metadata"};

        public a(androidx.media3.database.b bVar) {
            this.f62414a = bVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, k kVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            l.t(kVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(kVar.f62388a));
            contentValues.put(f62406h, kVar.f62389b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) androidx.media3.common.util.a.g(this.f62417d), null, contentValues);
        }

        public static void j(androidx.media3.database.b bVar, long j10) throws androidx.media3.database.a {
            k(bVar, Long.toHexString(j10));
        }

        private static void k(androidx.media3.database.b bVar, String str) throws androidx.media3.database.a {
            try {
                String strO = o(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    androidx.media3.database.g.c(writableDatabase, 1, str);
                    m(writableDatabase, strO);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new androidx.media3.database.a(e10);
            }
        }

        private void l(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) androidx.media3.common.util.a.g(this.f62417d), f62411m, new String[]{Integer.toString(i10)});
        }

        private static void m(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor n() {
            return this.f62414a.getReadableDatabase().query((String) androidx.media3.common.util.a.g(this.f62417d), f62412n, null, null, null, null, null);
        }

        private static String o(String str) {
            return f62403e + str;
        }

        private void p(SQLiteDatabase sQLiteDatabase) throws androidx.media3.database.a {
            androidx.media3.database.g.d(sQLiteDatabase, 1, (String) androidx.media3.common.util.a.g(this.f62416c), 1);
            m(sQLiteDatabase, (String) androidx.media3.common.util.a.g(this.f62417d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f62417d + " " + f62413o);
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void a() throws androidx.media3.database.a {
            k(this.f62414a, (String) androidx.media3.common.util.a.g(this.f62416c));
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void b(long j10) {
            String hexString = Long.toHexString(j10);
            this.f62416c = hexString;
            this.f62417d = o(hexString);
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void c(HashMap<String, k> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f62414a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    p(writableDatabase);
                    Iterator<k> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f62415b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new androidx.media3.database.a(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void d(k kVar) {
            this.f62415b.put(kVar.f62388a, kVar);
        }

        @Override // androidx.media3.datasource.cache.l.c
        public boolean e() throws androidx.media3.database.a {
            try {
                return androidx.media3.database.g.b(this.f62414a.getReadableDatabase(), 1, (String) androidx.media3.common.util.a.g(this.f62416c)) != -1;
            } catch (SQLException e10) {
                throw new androidx.media3.database.a(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void f(HashMap<String, k> map) throws IOException {
            if (this.f62415b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f62414a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f62415b.size(); i10++) {
                    try {
                        k kVarValueAt = this.f62415b.valueAt(i10);
                        if (kVarValueAt == null) {
                            l(writableDatabase, this.f62415b.keyAt(i10));
                        } else {
                            i(writableDatabase, kVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f62415b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new androidx.media3.database.a(e10);
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void g(k kVar, boolean z10) {
            if (z10) {
                this.f62415b.delete(kVar.f62388a);
            } else {
                this.f62415b.put(kVar.f62388a, null);
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void h(HashMap<String, k> map, SparseArray<String> sparseArray) throws IOException {
            androidx.media3.common.util.a.i(this.f62415b.size() == 0);
            try {
                if (androidx.media3.database.g.b(this.f62414a.getReadableDatabase(), 1, (String) androidx.media3.common.util.a.g(this.f62416c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f62414a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        p(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorN = n();
                while (cursorN.moveToNext()) {
                    try {
                        k kVar = new k(cursorN.getInt(0), (String) androidx.media3.common.util.a.g(cursorN.getString(1)), l.q(new DataInputStream(new ByteArrayInputStream(cursorN.getBlob(2)))));
                        map.put(kVar.f62389b, kVar);
                        sparseArray.put(kVar.f62388a, kVar.f62389b);
                    } catch (Throwable th3) {
                        if (cursorN != null) {
                            try {
                                cursorN.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorN.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new androidx.media3.database.a(e10);
            }
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f62418h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f62419i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f62420j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f62421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final Cipher f62422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final SecretKeySpec f62423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final SecureRandom f62424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.common.util.b f62425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f62426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private s f62427g;

        public b(File file, @p0 byte[] bArr, boolean z10) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            androidx.media3.common.util.a.i((bArr == null && z10) ? false : true);
            if (bArr != null) {
                androidx.media3.common.util.a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                androidx.media3.common.util.a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f62421a = z10;
            this.f62422b = cipher;
            this.f62423c = secretKeySpec;
            this.f62424d = z10 ? new SecureRandom() : null;
            this.f62425e = new androidx.media3.common.util.b(file);
        }

        private int i(k kVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (kVar.f62388a * 31) + kVar.f62389b.hashCode();
            if (i10 < 2) {
                long jF = m.f(kVar.d());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jF ^ (jF >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = kVar.d().hashCode();
            }
            return i11 + iHashCode;
        }

        private k j(int i10, DataInputStream dataInputStream) throws IOException {
            o oVarQ;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                n nVar = new n();
                n.h(nVar, j10);
                oVarQ = o.f62433f.h(nVar);
            } else {
                oVarQ = l.q(dataInputStream);
            }
            return new k(i11, utf, oVarQ);
        }

        private boolean k(HashMap<String, k> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f62425e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f62425e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f62422b == null) {
                                k1.t(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f62422b.init(2, (Key) k1.o(this.f62423c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f62422b));
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                                throw new IllegalStateException(e10);
                            }
                        } else if (this.f62421a) {
                            this.f62426f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int i12 = 0;
                        for (int i13 = 0; i13 < i11; i13++) {
                            k kVarJ = j(i10, dataInputStream2);
                            map.put(kVarJ.f62389b, kVarJ);
                            sparseArray.put(kVarJ.f62388a, kVarJ.f62389b);
                            i12 += i(kVarJ, i10);
                        }
                        int i14 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i14 == i12 && z10) {
                            k1.t(dataInputStream2);
                            return true;
                        }
                        k1.t(dataInputStream2);
                        return false;
                    }
                    k1.t(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k1.t(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k1.t(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void l(k kVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(kVar.f62388a);
            dataOutputStream.writeUTF(kVar.f62389b);
            l.t(kVar.d(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void m(HashMap<String, k> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.f62425e.f();
                s sVar = this.f62427g;
                if (sVar == null) {
                    this.f62427g = new s(outputStreamF);
                } else {
                    sVar.a(outputStreamF);
                }
                s sVar2 = this.f62427g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(sVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f62421a ? 1 : 0);
                    if (this.f62421a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) k1.o(this.f62424d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) k1.o(this.f62422b)).init(1, (Key) k1.o(this.f62423c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(sVar2, this.f62422b));
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                            throw new IllegalStateException(e10);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int i10 = 0;
                    for (k kVar : map.values()) {
                        l(kVar, dataOutputStream2);
                        i10 += i(kVar, 2);
                    }
                    dataOutputStream2.writeInt(i10);
                    this.f62425e.b(dataOutputStream2);
                    k1.t(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    k1.t(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void a() {
            this.f62425e.a();
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void b(long j10) {
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void c(HashMap<String, k> map) throws Throwable {
            m(map);
            this.f62426f = false;
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void d(k kVar) {
            this.f62426f = true;
        }

        @Override // androidx.media3.datasource.cache.l.c
        public boolean e() {
            return this.f62425e.c();
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void f(HashMap<String, k> map) throws Throwable {
            if (this.f62426f) {
                c(map);
            }
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void g(k kVar, boolean z10) {
            this.f62426f = true;
        }

        @Override // androidx.media3.datasource.cache.l.c
        public void h(HashMap<String, k> map, SparseArray<String> sparseArray) {
            androidx.media3.common.util.a.i(!this.f62426f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f62425e.a();
        }
    }

    private interface c {
        void a() throws IOException;

        void b(long j10);

        void c(HashMap<String, k> map) throws IOException;

        void d(k kVar);

        boolean e() throws IOException;

        void f(HashMap<String, k> map) throws IOException;

        void g(k kVar, boolean z10);

        void h(HashMap<String, k> map, SparseArray<String> sparseArray) throws IOException;
    }

    public l(androidx.media3.database.b bVar) {
        this(bVar, null, null, false, false);
    }

    private k c(String str) {
        int iL = l(this.f62398b);
        k kVar = new k(iL, str);
        this.f62397a.put(str, kVar);
        this.f62398b.put(iL, str);
        this.f62400d.put(iL, true);
        this.f62401e.d(kVar);
        return kVar;
    }

    @m1
    public static void f(androidx.media3.database.b bVar, long j10) throws androidx.media3.database.a {
        a.j(bVar, j10);
    }

    @l1
    static int l(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean o(String str) {
        return str.startsWith(f62395g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o q(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException("Invalid value size: " + i12);
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = k1.f61545f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new o(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(o oVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setI = oVar.i();
        dataOutputStream.writeInt(setI.size());
        for (Map.Entry<String, byte[]> entry : setI) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void d(String str, n nVar) {
        k kVarM = m(str);
        if (kVarM.b(nVar)) {
            this.f62401e.d(kVarM);
        }
    }

    public int e(String str) {
        return m(str).f62388a;
    }

    @p0
    public k g(String str) {
        return this.f62397a.get(str);
    }

    public Collection<k> h() {
        return Collections.unmodifiableCollection(this.f62397a.values());
    }

    public m i(String str) {
        k kVarG = g(str);
        return kVarG != null ? kVarG.d() : o.f62433f;
    }

    @p0
    public String j(int i10) {
        return this.f62398b.get(i10);
    }

    public Set<String> k() {
        return this.f62397a.keySet();
    }

    public k m(String str) {
        k kVar = this.f62397a.get(str);
        return kVar == null ? c(str) : kVar;
    }

    @m1
    public void n(long j10) throws IOException {
        c cVar;
        this.f62401e.b(j10);
        c cVar2 = this.f62402f;
        if (cVar2 != null) {
            cVar2.b(j10);
        }
        if (this.f62401e.e() || (cVar = this.f62402f) == null || !cVar.e()) {
            this.f62401e.h(this.f62397a, this.f62398b);
        } else {
            this.f62402f.h(this.f62397a, this.f62398b);
            this.f62401e.c(this.f62397a);
        }
        c cVar3 = this.f62402f;
        if (cVar3 != null) {
            cVar3.a();
            this.f62402f = null;
        }
    }

    public void p(String str) {
        k kVar = this.f62397a.get(str);
        if (kVar != null && kVar.g() && kVar.i()) {
            this.f62397a.remove(str);
            int i10 = kVar.f62388a;
            boolean z10 = this.f62400d.get(i10);
            this.f62401e.g(kVar, z10);
            if (z10) {
                this.f62398b.remove(i10);
                this.f62400d.delete(i10);
            } else {
                this.f62398b.put(i10, null);
                this.f62399c.put(i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        nb it = z6.A(this.f62397a.keySet()).iterator();
        while (it.hasNext()) {
            p((String) it.next());
        }
    }

    @m1
    public void s() throws IOException {
        this.f62401e.f(this.f62397a);
        int size = this.f62399c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f62398b.remove(this.f62399c.keyAt(i10));
        }
        this.f62399c.clear();
        this.f62400d.clear();
    }

    public l(@p0 androidx.media3.database.b bVar, @p0 File file, @p0 byte[] bArr, boolean z10, boolean z11) {
        androidx.media3.common.util.a.i((bVar == null && file == null) ? false : true);
        this.f62397a = new HashMap<>();
        this.f62398b = new SparseArray<>();
        this.f62399c = new SparseBooleanArray();
        this.f62400d = new SparseBooleanArray();
        a aVar = bVar != null ? new a(bVar) : null;
        b bVar2 = file != null ? new b(new File(file, f62395g), bArr, z10) : null;
        if (aVar == null || (bVar2 != null && z11)) {
            this.f62401e = (c) k1.o(bVar2);
            this.f62402f = aVar;
        } else {
            this.f62401e = aVar;
            this.f62402f = bVar2;
        }
    }
}
