package im;

/* JADX INFO: loaded from: classes13.dex */
public class d extends g implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f287249c = "*";

    @Override // im.a
    public String c() {
        return this.f287249c;
    }

    @Override // im.b
    public void d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f287249c = str;
    }
}
