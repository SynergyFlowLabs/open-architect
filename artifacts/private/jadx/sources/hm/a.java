package hm;

import gm.c;
import gm.d;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.java_websocket.framing.e;
import org.java_websocket.framing.f;
import org.java_websocket.framing.g;

/* JADX INFO: loaded from: classes13.dex */
public class a extends gm.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f285840g = "permessage-deflate";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f285841h = "server_no_context_takeover";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f285842i = "client_no_context_takeover";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f285843j = "server_max_window_bits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f285844k = "client_max_window_bits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f285845l = 32768;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f285846m = 32768;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f285847n = {0, 0, -1, -1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f285848o = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f285849a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f285850b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f285851c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f285852d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Inflater f285853e = new Inflater(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Deflater f285854f = new Deflater(-1, true);

    private void i(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.f285853e.setInput(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int iInflate = this.f285853e.inflate(bArr2);
            if (iInflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            }
        }
    }

    private static boolean j(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f285847n;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr2[i10] != bArr[(length - bArr2.length) + i10]) {
                return false;
            }
            i10++;
        }
    }

    @Override // gm.b, gm.d
    public d a() {
        return new a();
    }

    @Override // gm.b, gm.d
    public boolean b(String str) {
        for (String str2 : str.split(",")) {
            c cVarC = c.c(str2);
            if (f285840g.equalsIgnoreCase(cVarC.a())) {
                cVarC.b();
                return true;
            }
        }
        return false;
    }

    @Override // gm.b, gm.d
    public void c(f fVar) {
        if (fVar instanceof e) {
            byte[] bArrArray = fVar.b().array();
            if (bArrArray.length >= this.f285849a) {
                if (!(fVar instanceof org.java_websocket.framing.c)) {
                    ((e) fVar).m(true);
                }
                this.f285854f.setInput(bArrArray);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int iDeflate = this.f285854f.deflate(bArr, 0, 1024, 2);
                    if (iDeflate <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, iDeflate);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                if (fVar.h()) {
                    if (j(byteArray)) {
                        length -= f285847n.length;
                    }
                    if (this.f285850b) {
                        this.f285854f.end();
                        this.f285854f = new Deflater(-1, true);
                    }
                }
                ((g) fVar).l(ByteBuffer.wrap(byteArray, 0, length));
            }
        }
    }

    @Override // gm.b, gm.d
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("permessage-deflate; server_no_context_takeover");
        sb2.append(this.f285851c ? "; client_no_context_takeover" : "");
        return sb2.toString();
    }

    @Override // gm.b, gm.d
    public boolean e(String str) {
        for (String str2 : str.split(",")) {
            c cVarC = c.c(str2);
            if (f285840g.equalsIgnoreCase(cVarC.a())) {
                this.f285852d.putAll(cVarC.b());
                if (this.f285852d.containsKey(f285842i)) {
                    this.f285851c = true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // gm.b, gm.d
    public void f(f fVar) throws fm.c {
        if ((fVar instanceof e) && (fVar.d() || fVar.f() == em.c.CONTINUOUS)) {
            if (fVar.f() == em.c.CONTINUOUS && fVar.d()) {
                throw new fm.c(1008, "RSV1 bit can only be set for the first frame.");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                i(fVar.b().array(), byteArrayOutputStream);
                if (this.f285853e.getRemaining() > 0) {
                    this.f285853e = new Inflater(true);
                    i(fVar.b().array(), byteArrayOutputStream);
                }
                if (fVar.h()) {
                    i(f285847n, byteArrayOutputStream);
                    if (this.f285851c) {
                        this.f285853e = new Inflater(true);
                    }
                }
                ((g) fVar).l(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
            } catch (DataFormatException e10) {
                throw new fm.c(1008, e10.getMessage());
            }
        }
    }

    @Override // gm.b, gm.d
    public String g() {
        this.f285852d.put(f285842i, "");
        this.f285852d.put(f285841h, "");
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // gm.a, gm.b, gm.d
    public void h(f fVar) throws fm.c {
        if (!(fVar instanceof org.java_websocket.framing.c) || (!fVar.d() && !fVar.e() && !fVar.g())) {
            super.h(fVar);
            return;
        }
        throw new fm.e("bad rsv RSV1: " + fVar.d() + " RSV2: " + fVar.e() + " RSV3: " + fVar.g());
    }

    public Deflater k() {
        return this.f285854f;
    }

    public Inflater l() {
        return this.f285853e;
    }

    public int m() {
        return this.f285849a;
    }

    public boolean n() {
        return this.f285851c;
    }

    public boolean o() {
        return this.f285850b;
    }

    public void p(boolean z10) {
        this.f285851c = z10;
    }

    public void q(Deflater deflater) {
        this.f285854f = deflater;
    }

    public void r(Inflater inflater) {
        this.f285853e = inflater;
    }

    public void s(boolean z10) {
        this.f285850b = z10;
    }

    public void t(int i10) {
        this.f285849a = i10;
    }

    @Override // gm.b, gm.d
    public String toString() {
        return "PerMessageDeflateExtension";
    }
}
