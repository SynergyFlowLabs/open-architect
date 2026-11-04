package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class q extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Class<?> f51296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<a> f51297b;

    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f51298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f51299b = new AtomicInteger(0);

        a(Object obj) {
            this.f51298a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof k;
        }

        final void a() {
            this.f51299b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f51298a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f51298a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        final void c() {
            this.f51299b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f51299b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f51298a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            if (this.f51299b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f51298a).onSpanChanged(spannable, obj, i10, i11, i12, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f51299b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f51298a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f51298a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    @b1({b1.a.LIBRARY})
    q(@NonNull Class<?> cls) {
        this.f51297b = new ArrayList();
        androidx.core.util.t.m(cls, "watcherClass cannot be null");
        this.f51296a = cls;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f51297b.size(); i10++) {
            this.f51297b.get(i10).a();
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static q c(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new q(cls, charSequence);
    }

    private void e() {
        for (int i10 = 0; i10 < this.f51297b.size(); i10++) {
            this.f51297b.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i10 = 0; i10 < this.f51297b.size(); i10++) {
            a aVar = this.f51297b.get(i10);
            if (aVar.f51298a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(@NonNull Class<?> cls) {
        return this.f51296a == cls;
    }

    private boolean h(@p0 Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i10 = 0; i10 < this.f51297b.size(); i10++) {
            this.f51297b.get(i10).c();
        }
    }

    @b1({b1.a.LIBRARY})
    public void a() {
        b();
    }

    @b1({b1.a.LIBRARY})
    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@p0 Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @e.a({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, @NonNull Class<T> cls) {
        if (!g(cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f51298a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, @p0 Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@p0 Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f51297b.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@p0 Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f51297b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @e.a({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new q(this.f51296a, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @b1({b1.a.LIBRARY})
    q(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f51297b = new ArrayList();
        androidx.core.util.t.m(cls, "watcherClass cannot be null");
        this.f51296a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@e.a({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @b1({b1.a.LIBRARY})
    q(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f51297b = new ArrayList();
        androidx.core.util.t.m(cls, "watcherClass cannot be null");
        this.f51296a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@e.a({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @e.a({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
