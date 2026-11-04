package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44183c;

    public h(String str, c cVar) {
        super(str);
        this.f44181a = str;
        if (cVar != null) {
            this.f44183c = cVar.v();
            this.f44182b = cVar.t();
        } else {
            this.f44183c = "unknown";
            this.f44182b = 0;
        }
    }

    public String a() {
        return this.f44181a + " (" + this.f44183c + " at line " + this.f44182b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
