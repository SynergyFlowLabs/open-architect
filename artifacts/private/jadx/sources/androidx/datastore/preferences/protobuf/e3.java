package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@y
final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f50293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f50294c;

    public e3(int id2, Field caseField, Field valueField) {
        this.f50292a = id2;
        this.f50293b = caseField;
        this.f50294c = valueField;
    }

    public Field a() {
        return this.f50293b;
    }

    public int b() {
        return this.f50292a;
    }

    public Field c() {
        return this.f50294c;
    }
}
