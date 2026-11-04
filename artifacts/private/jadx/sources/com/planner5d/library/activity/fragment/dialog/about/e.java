package com.planner5d.library.activity.fragment.dialog.about;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.x4;
import com.planner5d.library.model.manager.y4;
import com.planner5d.library.model.manager.z4;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.rx.i;
import com.planner5d.library.services.u;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.widget.EditTextWithValidator;
import com.planner5d.library.widget.editor.projectsettings.ProjectSettingCheckboxView;
import com.planner5d.library.widget.n1;
import java.util.LinkedList;
import java.util.Objects;
import java.util.function.BiFunction;
import kotlin.Unit;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class e extends LinearLayout implements EditTextWithValidator.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditTextWithValidator f131702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EditTextWithValidator f131703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Spinner f131704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n1<String> f131705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ProjectSettingCheckboxView f131706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Button f131707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f131708g;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (e.this.f131708g != i10) {
                e.this.validate();
                e.this.f131708g = i10;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b extends com.planner5d.library.services.rx.e<Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r3 f131710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u1 f131711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ About f131712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f131713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ FragmentManager f131714h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ o4 f131715i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z4 f131716j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q4 f131717k;

        b(r3 r3Var, u1 u1Var, About about, u uVar, FragmentManager fragmentManager, o4 o4Var, z4 z4Var, q4 q4Var) {
            this.f131710d = r3Var;
            this.f131711e = u1Var;
            this.f131712f = about;
            this.f131713g = uVar;
            this.f131714h = fragmentManager;
            this.f131715i = o4Var;
            this.f131716j = z4Var;
            this.f131717k = q4Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f131710d.R0(p3.b.error, p3.a.other);
            this.f131711e.b("support_request", null, th2);
            this.f131712f.dismissAllowingStateLoss();
            Context context = e.this.getContext();
            if (context != null) {
                this.f131713g.c(this.f131714h, this.f131715i.b(context));
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f131710d.R0(p3.b.success, null);
            this.f131712f.dismissAllowingStateLoss();
            Context context = e.this.getContext();
            if (context != null) {
                String strA = this.f131716j.a();
                u uVar = this.f131713g;
                FragmentManager fragmentManager = this.f131714h;
                int i10 = pc.b.r.rC;
                if (strA == null) {
                    strA = this.f131717k.b();
                }
                uVar.c(fragmentManager, context.getString(i10, strA));
            }
        }
    }

    public e(final About about, final q4 q4Var, final o4 o4Var, final u1 u1Var, final e1 e1Var, final t2 t2Var, final z4 z4Var, final w wVar, final r3 r3Var, final u uVar, final FragmentManager fragmentManager) {
        super(about.getContext());
        this.f131708g = 0;
        final Context context = getContext();
        setOrientation(1);
        View.inflate(context, pc.b.l.X, this);
        this.f131704c = (Spinner) findViewById(pc.b.i.f343104a4);
        final y4[] y4VarArrC = o4Var.c();
        LinkedList linkedList = new LinkedList();
        linkedList.add("[" + context.getString(pc.b.r.sC) + "]");
        int length = y4VarArrC.length;
        for (int i10 = 0; i10 < length; i10++) {
            linkedList.add(y4VarArrC[i10].o(context));
        }
        Spinner spinner = this.f131704c;
        n1<String> n1Var = new n1<>(context, (String[]) linkedList.toArray(new String[0]), n1.a.DEFAULT);
        this.f131705d = n1Var;
        spinner.setAdapter((SpinnerAdapter) n1Var);
        this.f131704c.setOnItemSelectedListener(new a());
        this.f131702a = ((EditTextWithValidator) findViewById(pc.b.i.B3)).e(this);
        EditTextWithValidator editTextWithValidatorE = ((EditTextWithValidator) findViewById(pc.b.i.f343269l4)).e(this);
        this.f131703b = editTextWithValidatorE;
        Button button = (Button) findViewById(pc.b.i.f343162e2);
        this.f131707f = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.about.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131687a.e(context, about, y4VarArrC, o4Var, u1Var, e1Var, t2Var, z4Var, q4Var, r3Var, wVar, uVar, fragmentManager, view);
            }
        });
        id.a aVarA = wVar.a();
        if (aVarA != null) {
            editTextWithValidatorE.setText(aVarA.f287079e);
        }
        validate();
        this.f131704c.setFocusable(true);
        this.f131704c.setFocusableInTouchMode(true);
        this.f131704c.requestFocus();
        n1Var.c(0, null);
        n1Var.notifyDataSetChanged();
        ProjectSettingCheckboxView projectSettingCheckboxView = (ProjectSettingCheckboxView) findViewById(pc.b.i.f343266l1);
        this.f131706e = projectSettingCheckboxView;
        projectSettingCheckboxView.setTitle(context.getString(pc.b.r.pC));
        projectSettingCheckboxView.c();
        projectSettingCheckboxView.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Context context, About about, y4[] y4VarArr, o4 o4Var, u1 u1Var, e1 e1Var, t2 t2Var, z4 z4Var, q4 q4Var, r3 r3Var, w wVar, u uVar, FragmentManager fragmentManager, View view) {
        h(context, about, y4VarArr, o4Var, u1Var, e1Var, t2Var, z4Var, q4Var, r3Var, wVar, uVar, fragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(t2 t2Var, w wVar, e1 e1Var, Context context, y4[] y4VarArr, final o4 o4Var, r3 r3Var, u1 u1Var, About about, u uVar, FragmentManager fragmentManager, z4 z4Var, q4 q4Var, Subscriber subscriber) {
        x4 x4Var = new x4();
        com.planner5d.library.model.manager.a aVar = new com.planner5d.library.model.manager.a(t2Var);
        id.a aVarA = wVar.a();
        x4Var.f222391b = this.f131702a.getText().toString();
        x4Var.f222390a = e1Var.a() + aVar.b(context, x.a(aVarA));
        x4Var.f222393d = y4VarArr[this.f131704c.getSelectedItemPosition() + (-1)].n();
        x4Var.f222392c = this.f131703b.getText().toString();
        x4Var.f222394e = this.f131706e.a();
        Objects.requireNonNull(o4Var);
        c0.y(x4Var, new BiFunction() { // from class: com.planner5d.library.activity.fragment.dialog.about.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return o4Var.h((x4) obj, (kotlin.coroutines.d) obj2);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new b(r3Var, u1Var, about, uVar, fragmentManager, o4Var, z4Var, q4Var));
    }

    private void h(final Context context, final About about, final y4[] y4VarArr, final o4 o4Var, final u1 u1Var, final e1 e1Var, final t2 t2Var, final z4 z4Var, final q4 q4Var, final r3 r3Var, final w wVar, final u uVar, final FragmentManager fragmentManager) {
        if (validate()) {
            r3Var.R0(p3.b.submit, null);
            about.setProgress(context.getString(pc.b.r.wz));
            i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.fragment.dialog.about.b
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.f131673a.g(t2Var, wVar, e1Var, context, y4VarArr, o4Var, r3Var, u1Var, about, uVar, fragmentManager, z4Var, q4Var, (Subscriber) obj);
                }
            });
        }
    }

    @Override // com.planner5d.library.widget.EditTextWithValidator.b
    public boolean validate() {
        boolean z10 = this.f131704c.getSelectedItemPosition() > 0;
        boolean z11 = this.f131703b.getText().length() > 0 && q0.f224534a.a(this.f131703b);
        boolean z12 = this.f131702a.getText().length() > 0 && z11 && z10;
        this.f131703b.d(true ^ z11, androidx.core.content.d.g(getContext(), pc.b.e.Th));
        this.f131707f.setEnabled(z12);
        this.f131707f.setTextColor(androidx.core.content.d.g(getContext(), z12 ? pc.b.e.N1 : pc.b.e.O1));
        this.f131705d.c(0, z10 ? null : Integer.valueOf(l1.a.f316127c));
        this.f131705d.notifyDataSetChanged();
        return z12;
    }
}
