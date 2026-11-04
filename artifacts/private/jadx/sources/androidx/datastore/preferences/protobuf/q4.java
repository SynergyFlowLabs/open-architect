package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q4 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f50546b = -7466929953374883507L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f50547a;

    public q4(final q2 message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        boolean z10 = true & false;
        this.f50547a = null;
    }

    private static String b(final List<String> missingFields) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : missingFields) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public t1 a() {
        return new t1(getMessage());
    }

    public List<String> c() {
        return Collections.unmodifiableList(this.f50547a);
    }

    public q4(final List<String> missingFields) {
        super(b(missingFields));
        this.f50547a = missingFields;
    }
}
