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
public class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f366715g = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f366716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Reader f366717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f366718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f366719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f366720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f366721f;

    public m(File file, n nVar) {
        this.f366719d = 0;
        int i10 = 5 | (-1);
        this.f366720e = -1;
        this.f366721f = 0;
        this.f366716a = file;
        this.f366718c = nVar;
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
        return this.f366720e >= 0 && list.size() >= this.f366720e;
    }

    private List d(BufferedReader bufferedReader) throws h, IOException {
        ArrayList arrayList = new ArrayList();
        while (!a(bufferedReader) && !b(arrayList)) {
            org.locationtech.jts.geom.n nVarM = this.f366718c.m(bufferedReader);
            if (this.f366719d >= this.f366721f) {
                arrayList.add(nVarM);
            }
            this.f366719d++;
        }
        return arrayList;
    }

    public List c() throws h, IOException {
        if (this.f366716a != null) {
            this.f366717b = new FileReader(this.f366716a);
        }
        this.f366719d = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(this.f366717b);
            try {
                List listD = d(bufferedReader);
                bufferedReader.close();
                this.f366717b.close();
                return listD;
            } catch (Throwable th2) {
                bufferedReader.close();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f366717b.close();
            throw th3;
        }
    }

    public void e(int i10) {
        this.f366720e = i10;
    }

    public void f(int i10) {
        this.f366721f = i10;
    }

    public m(String str, n nVar) {
        this(new File(str), nVar);
    }

    public m(Reader reader, n nVar) {
        this.f366716a = null;
        this.f366719d = 0;
        this.f366720e = -1;
        this.f366721f = 0;
        this.f366717b = reader;
        this.f366718c = nVar;
    }
}
