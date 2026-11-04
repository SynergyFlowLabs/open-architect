package rm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f366692g = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f366693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Reader f366694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f366695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f366696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f366697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f366698f;

    public j(File file, k kVar) {
        this.f366696d = 0;
        this.f366697e = -1;
        this.f366698f = 0;
        this.f366693a = file;
        this.f366695c = kVar;
    }

    private boolean a(BufferedReader bufferedReader) throws IOException {
        bufferedReader.mark(1000);
        if (new StreamTokenizer(bufferedReader).nextToken() == -1) {
            return true;
        }
        bufferedReader.reset();
        return false;
    }

    private boolean b(List list) {
        return this.f366697e >= 0 && list.size() >= this.f366697e;
    }

    private List d(BufferedReader bufferedReader) throws h, IOException {
        ArrayList arrayList = new ArrayList();
        while (!a(bufferedReader) && !b(arrayList)) {
            String strTrim = bufferedReader.readLine().trim();
            if (strTrim.length() != 0) {
                org.locationtech.jts.geom.n nVarD = this.f366695c.d(k.a(strTrim));
                if (this.f366696d >= this.f366698f) {
                    arrayList.add(nVarD);
                }
                this.f366696d++;
            }
        }
        return arrayList;
    }

    public List c() throws h, IOException {
        if (this.f366693a != null) {
            this.f366694b = new FileReader(this.f366693a);
        }
        this.f366696d = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(this.f366694b);
            try {
                List listD = d(bufferedReader);
                bufferedReader.close();
                this.f366694b.close();
                return listD;
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f366694b.close();
            throw th3;
        }
    }

    public void e(int i10) {
        this.f366697e = i10;
    }

    public void f(int i10) {
        this.f366698f = i10;
    }

    public j(String str, k kVar) {
        this(new File(str), kVar);
    }

    public j(Reader reader, k kVar) {
        this.f366693a = null;
        this.f366696d = 0;
        this.f366697e = -1;
        this.f366698f = 0;
        this.f366694b = reader;
        this.f366695c = kVar;
    }
}
