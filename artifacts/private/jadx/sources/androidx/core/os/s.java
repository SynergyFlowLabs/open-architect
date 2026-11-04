package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f48086a;

    s(Object obj) {
        this.f48086a = (LocaleList) obj;
    }

    @Override // androidx.core.os.r
    public String a() {
        return this.f48086a.toLanguageTags();
    }

    @Override // androidx.core.os.r
    public Object b() {
        return this.f48086a;
    }

    @Override // androidx.core.os.r
    @androidx.annotation.p0
    public Locale c(@NonNull String[] strArr) {
        return this.f48086a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.r
    public int d(Locale locale) {
        return this.f48086a.indexOf(locale);
    }

    public boolean equals(Object obj) {
        return this.f48086a.equals(((r) obj).b());
    }

    @Override // androidx.core.os.r
    public Locale get(int i10) {
        return this.f48086a.get(i10);
    }

    public int hashCode() {
        return this.f48086a.hashCode();
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f48086a.isEmpty();
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f48086a.size();
    }

    public String toString() {
        return this.f48086a.toString();
    }
}
