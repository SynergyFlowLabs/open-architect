package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l
    @p0
    public final Integer f11825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.l
    @p0
    public final Integer f11826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.l
    @p0
    public final Integer f11827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.l
    @p0
    public final Integer f11828d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private Integer f11829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private Integer f11830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private Integer f11831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private Integer f11832d;

        @NonNull
        public a a() {
            return new a(this.f11829a, this.f11830b, this.f11831c, this.f11832d);
        }

        @NonNull
        public C0040a b(@androidx.annotation.l int i10) {
            this.f11831c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        @NonNull
        public C0040a c(@androidx.annotation.l int i10) {
            this.f11832d = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public C0040a d(@androidx.annotation.l int i10) {
            this.f11830b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public C0040a e(@androidx.annotation.l int i10) {
            this.f11829a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(@androidx.annotation.l @p0 Integer num, @androidx.annotation.l @p0 Integer num2, @androidx.annotation.l @p0 Integer num3, @androidx.annotation.l @p0 Integer num4) {
        this.f11825a = num;
        this.f11826b = num2;
        this.f11827c = num3;
        this.f11828d = num4;
    }

    @NonNull
    static a a(@p0 Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new a((Integer) bundle.get(d.f11881k), (Integer) bundle.get(d.f11889s), (Integer) bundle.get(d.M), (Integer) bundle.get(d.Z));
    }

    @NonNull
    Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f11825a;
        if (num != null) {
            bundle.putInt(d.f11881k, num.intValue());
        }
        Integer num2 = this.f11826b;
        if (num2 != null) {
            bundle.putInt(d.f11889s, num2.intValue());
        }
        Integer num3 = this.f11827c;
        if (num3 != null) {
            bundle.putInt(d.M, num3.intValue());
        }
        Integer num4 = this.f11828d;
        if (num4 != null) {
            bundle.putInt(d.Z, num4.intValue());
        }
        return bundle;
    }

    @NonNull
    a c(@NonNull a aVar) {
        Integer num = this.f11825a;
        if (num == null) {
            num = aVar.f11825a;
        }
        Integer num2 = this.f11826b;
        if (num2 == null) {
            num2 = aVar.f11826b;
        }
        Integer num3 = this.f11827c;
        if (num3 == null) {
            num3 = aVar.f11827c;
        }
        Integer num4 = this.f11828d;
        if (num4 == null) {
            num4 = aVar.f11828d;
        }
        return new a(num, num2, num3, num4);
    }
}
