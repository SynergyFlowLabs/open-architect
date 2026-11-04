package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class t1 extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f50593c = -1616151763072450476L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q2 f50594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50595b;

    public static class a extends t1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f50596d = 3283890091615336259L;

        public a(String description) {
            super(description);
        }
    }

    public t1(String description) {
        super(description);
        this.f50594a = null;
    }

    static t1 c() {
        return new t1("Protocol message end-group tag did not match expected tag.");
    }

    static t1 d() {
        return new t1("Protocol message contained an invalid tag (zero).");
    }

    static t1 e() {
        return new t1("Protocol message had invalid UTF-8.");
    }

    static a f() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static t1 g() {
        return new t1("CodedInputStream encountered a malformed varint.");
    }

    static t1 h() {
        return new t1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static t1 i() {
        return new t1("Failed to parse the message.");
    }

    static t1 j() {
        return new t1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static t1 m() {
        return new t1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static t1 n() {
        return new t1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f50595b;
    }

    public q2 b() {
        return this.f50594a;
    }

    void k() {
        this.f50595b = true;
    }

    public t1 l(q2 unfinishedMessage) {
        this.f50594a = unfinishedMessage;
        return this;
    }

    public IOException o() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public t1(Exception e10) {
        super(e10.getMessage(), e10);
        this.f50594a = null;
    }

    public t1(String description, Exception e10) {
        super(description, e10);
        int i10 = 5 ^ 0;
        this.f50594a = null;
    }

    public t1(IOException e10) {
        super(e10.getMessage(), e10);
        this.f50594a = null;
    }

    public t1(String description, IOException e10) {
        super(description, e10);
        this.f50594a = null;
    }
}
