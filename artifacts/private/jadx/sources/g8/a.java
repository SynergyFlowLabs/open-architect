package g8;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f275411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f275412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f275413c;

    public a(int i10, d... dVarArr) {
        this.f275411a = i10;
        this.f275412b = dVarArr;
        this.f275413c = new b(i10);
    }

    @Override // g8.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f275411a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f275412b) {
            if (stackTraceElementArrA.length <= this.f275411a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f275411a ? this.f275413c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
