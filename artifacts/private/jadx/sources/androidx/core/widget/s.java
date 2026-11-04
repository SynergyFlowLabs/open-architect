package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,88:1\n55#1,12:89\n84#1,3:101\n55#1,12:104\n84#1,3:116\n55#1,12:119\n84#1,3:131\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n30#1:89,12\n30#1:101,3\n39#1:104,12\n39#1:116,3\n48#1:119,12\n48#1:131,3\n*E\n"})
public final class s {

    public static final class a extends l0 implements pj.o<CharSequence, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49154a = new a();

        public a() {
            super(4);
        }

        public final void c(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return Unit.f312394a;
        }
    }

    public static final class b extends l0 implements pj.o<CharSequence, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f49155a = new b();

        public b() {
            super(4);
        }

        public final void c(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return Unit.f312394a;
        }
    }

    public static final class c extends l0 implements Function1<Editable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f49156a = new c();

        public c() {
            super(1);
        }

        public final void c(Editable editable) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            c(editable);
            return Unit.f312394a;
        }
    }

    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Editable, Unit> f49157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.o<CharSequence, Integer, Integer, Integer, Unit> f49158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.o<CharSequence, Integer, Integer, Integer, Unit> f49159c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Editable, Unit> function1, pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar, pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar2) {
            this.f49157a = function1;
            this.f49158b = oVar;
            this.f49159c = oVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f49157a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f49158b.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f49159c.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class e implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f49160a;

        public e(Function1 function1) {
            this.f49160a = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f49160a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n63#2:83\n62#3:84\n*E\n"})
    public static final class f implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o f49161a;

        public f(pj.o oVar) {
            this.f49161a = oVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f49161a.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,82:1\n63#2:83\n59#3:84\n*E\n"})
    public static final class g implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o f49162a;

        public g(pj.o oVar) {
            this.f49162a = oVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f49162a.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @NotNull
    public static final TextWatcher a(@NotNull TextView textView, @NotNull pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar, @NotNull pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar2, @NotNull Function1<? super Editable, Unit> function1) {
        d dVar = new d(function1, oVar, oVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, pj.o oVar, pj.o oVar2, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            oVar = a.f49154a;
        }
        if ((i10 & 2) != 0) {
            oVar2 = b.f49155a;
        }
        if ((i10 & 4) != 0) {
            function1 = c.f49156a;
        }
        d dVar = new d(function1, oVar, oVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @NotNull
    public static final TextWatcher c(@NotNull TextView textView, @NotNull Function1<? super Editable, Unit> function1) {
        e eVar = new e(function1);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @NotNull
    public static final TextWatcher d(@NotNull TextView textView, @NotNull pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar) {
        f fVar = new f(oVar);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @NotNull
    public static final TextWatcher e(@NotNull TextView textView, @NotNull pj.o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> oVar) {
        g gVar = new g(oVar);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}
