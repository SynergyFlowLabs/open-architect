package km;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f312389b = Pattern.compile(" ");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f312390c = Pattern.compile(",");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f312391a;

    public b(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f312391a = str;
    }

    @Override // km.a
    public a a() {
        return new b(c());
    }

    @Override // km.a
    public boolean b(String str) {
        if ("".equals(this.f312391a)) {
            return true;
        }
        for (String str2 : f312390c.split(f312389b.matcher(str).replaceAll(""))) {
            if (this.f312391a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // km.a
    public String c() {
        return this.f312391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f312391a.equals(((b) obj).f312391a);
    }

    public int hashCode() {
        return this.f312391a.hashCode();
    }

    @Override // km.a
    public String toString() {
        return c();
    }
}
