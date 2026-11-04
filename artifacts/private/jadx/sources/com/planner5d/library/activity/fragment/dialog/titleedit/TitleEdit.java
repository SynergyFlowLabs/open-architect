package com.planner5d.library.activity.fragment.dialog.titleedit;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.services.r;
import com.planner5d.library.services.s;
import com.planner5d.library.services.utility.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public abstract class TitleEdit<T, Result> extends ContentDialog<Result> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private EditText f133065o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private View f133066p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @Nullable
    private T f133067q3;

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit$createContentView$1", f = "TitleEdit.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TitleEdit<T, Result> f133070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f133071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f133072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewGroup f133073f;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit$a$a, reason: collision with other inner class name */
        public static final class C1465a implements TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TitleEdit<T, Result> f133074a;

            C1465a(TitleEdit<T, Result> titleEdit) {
                this.f133074a = titleEdit;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s10) {
                Intrinsics.checkNotNullParameter(s10, "s");
                this.f133074a.X();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
                Intrinsics.checkNotNullParameter(s10, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
                Intrinsics.checkNotNullParameter(s10, "s");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TitleEdit<T, Result> titleEdit, j jVar, View view, ViewGroup viewGroup, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f133070c = titleEdit;
            this.f133071d = jVar;
            this.f133072e = view;
            this.f133073f = viewGroup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(TitleEdit titleEdit, TextView textView, int i10, KeyEvent keyEvent) {
            return i10 == 6 && !titleEdit.W();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(TitleEdit titleEdit, View view) {
            titleEdit.W();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f133070c, this.f133071d, this.f133072e, this.f133073f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x008a  */
        /* JADX WARN: Code duplicated, block: B:21:0x009f  */
        /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TitleEdit<T, Result> titleEdit;
            Object model;
            TitleEdit<T, Result> titleEdit2;
            EditText editText;
            EditText editText2;
            View view;
            EditText editText3;
            EditText editText4;
            String modelTitle;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133069b;
            if (i10 == 0) {
                ResultKt.m(obj);
                titleEdit = this.f133070c;
                j jVar = this.f133071d;
                r rVar = r.id;
                if (jVar.a(rVar)) {
                    TitleEdit<T, Result> titleEdit3 = this.f133070c;
                    long jD = this.f133071d.d(rVar, 0L);
                    this.f133068a = titleEdit;
                    this.f133069b = 1;
                    Object objT = titleEdit3.T(jD, this);
                    if (objT == objL) {
                        return objL;
                    }
                    titleEdit2 = titleEdit;
                    obj = objT;
                } else {
                    model = this.f133070c.getModel();
                }
                ((TitleEdit) titleEdit).f133067q3 = model;
                TitleEdit<T, Result> titleEdit4 = this.f133070c;
                titleEdit4.R(titleEdit4.getTitle((T) ((TitleEdit) titleEdit4).f133067q3), null);
                ((TitleEdit) this.f133070c).f133065o3 = (EditText) this.f133072e.findViewById(com.planner5d.library.f.j.f168451ve);
                editText = ((TitleEdit) this.f133070c).f133065o3;
                if (editText != null) {
                    final TitleEdit<T, Result> titleEdit5 = this.f133070c;
                    editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.activity.fragment.dialog.titleedit.d
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                            return TitleEdit.a.n(titleEdit5, textView, i11, keyEvent);
                        }
                    });
                }
                editText2 = ((TitleEdit) this.f133070c).f133065o3;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new C1465a(this.f133070c));
                }
                ((TitleEdit) this.f133070c).f133066p3 = this.f133073f.findViewById(com.planner5d.library.f.j.C5);
                view = ((TitleEdit) this.f133070c).f133066p3;
                if (view != null) {
                    final TitleEdit<T, Result> titleEdit6 = this.f133070c;
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.titleedit.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TitleEdit.a.s(titleEdit6, view2);
                        }
                    });
                }
                editText3 = ((TitleEdit) this.f133070c).f133065o3;
                if (editText3 != null) {
                    if (((TitleEdit) this.f133070c).f133067q3 == null) {
                        modelTitle = this.f133070c.U();
                    } else {
                        TitleEdit<T, Result> titleEdit7 = this.f133070c;
                        modelTitle = titleEdit7.getModelTitle((T) ((TitleEdit) titleEdit7).f133067q3);
                    }
                    editText3.setText(modelTitle);
                }
                editText4 = ((TitleEdit) this.f133070c).f133065o3;
                if (editText4 != null) {
                    editText4.selectAll();
                }
                this.f133070c.X();
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            titleEdit2 = (TitleEdit) this.f133068a;
            ResultKt.m(obj);
            TitleEdit<T, Result> titleEdit8 = titleEdit2;
            model = obj;
            titleEdit = titleEdit8;
            ((TitleEdit) titleEdit).f133067q3 = model;
            TitleEdit<T, Result> titleEdit9 = this.f133070c;
            titleEdit9.R(titleEdit9.getTitle((T) ((TitleEdit) titleEdit9).f133067q3), null);
            ((TitleEdit) this.f133070c).f133065o3 = (EditText) this.f133072e.findViewById(com.planner5d.library.f.j.f168451ve);
            editText = ((TitleEdit) this.f133070c).f133065o3;
            if (editText != null) {
                final TitleEdit titleEdit10 = this.f133070c;
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.planner5d.library.activity.fragment.dialog.titleedit.d
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        return TitleEdit.a.n(titleEdit10, textView, i11, keyEvent);
                    }
                });
            }
            editText2 = ((TitleEdit) this.f133070c).f133065o3;
            if (editText2 != null) {
                editText2.addTextChangedListener(new C1465a(this.f133070c));
            }
            ((TitleEdit) this.f133070c).f133066p3 = this.f133073f.findViewById(com.planner5d.library.f.j.C5);
            view = ((TitleEdit) this.f133070c).f133066p3;
            if (view != null) {
                final TitleEdit titleEdit11 = this.f133070c;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.titleedit.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TitleEdit.a.s(titleEdit11, view2);
                    }
                });
            }
            editText3 = ((TitleEdit) this.f133070c).f133065o3;
            if (editText3 != null) {
                if (((TitleEdit) this.f133070c).f133067q3 == null) {
                    modelTitle = this.f133070c.U();
                } else {
                    TitleEdit<T, Result> titleEdit12 = this.f133070c;
                    modelTitle = titleEdit12.getModelTitle((T) ((TitleEdit) titleEdit12).f133067q3);
                }
                editText3.setText(modelTitle);
            }
            editText4 = ((TitleEdit) this.f133070c).f133065o3;
            if (editText4 != null) {
                editText4.selectAll();
            }
            this.f133070c.X();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(TitleEdit titleEdit) {
        s.f(titleEdit.f133065o3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X() {
        Editable text;
        String string;
        EditText editText = this.f133065o3;
        boolean z10 = false;
        if (editText != null && (text = editText.getText()) != null && (string = text.toString()) != null && string.length() > 0) {
            z10 = true;
        }
        View view = this.f133066p3;
        if (view != null) {
            view.setEnabled(z10);
        }
        return z10;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        View viewInflate = LayoutInflater.from(root.getContext()).inflate(com.planner5d.library.f.m.f168628a1, root, false);
        j jVar = new j(getArguments());
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        int i10 = 6 ^ 0;
        k.f(p0.a(viewLifecycleOwner), null, null, new a(this, jVar, viewInflate, root, null), 3, null);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Nullable
    protected abstract Object T(long j10, @NotNull kotlin.coroutines.d<? super T> dVar);

    @Nullable
    protected String U() {
        return null;
    }

    protected boolean W() {
        Editable text;
        if (!X()) {
            return false;
        }
        T t10 = this.f133067q3;
        EditText editText = this.f133065o3;
        save(t10, (editText == null || (text = editText.getText()) == null) ? null : text.toString());
        dismiss();
        return true;
    }

    @Nullable
    protected T getModel() {
        return this.f133067q3;
    }

    @Nullable
    protected abstract String getModelTitle(@Nullable T t10);

    @Nullable
    protected abstract String getTitle(@Nullable T t10);

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EditText editText = this.f133065o3;
        if (editText != null) {
            editText.postDelayed(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.titleedit.c
                @Override // java.lang.Runnable
                public final void run() {
                    TitleEdit.V(this.f133081a);
                }
            }, 100L);
        }
    }

    protected abstract void save(@Nullable T t10, @Nullable String str);
}
