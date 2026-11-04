package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.interop.rollouts.f;
import com.google.firebase.remoteconfig.t;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f124620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f124621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f124622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<f> f124623d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(@NonNull g gVar, @NonNull a aVar, @NonNull Executor executor) {
        this.f124620a = gVar;
        this.f124621b = aVar;
        this.f124622c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, final f fVar, h hVar) {
        eVar.getClass();
        try {
            h hVar2 = (h) task.q();
            if (hVar2 != null) {
                final com.google.firebase.remoteconfig.interop.rollouts.e eVarB = eVar.f124621b.b(hVar2);
                eVar.f124622c.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (t unused) {
        }
    }

    public void d(@NonNull h hVar) {
        try {
            final com.google.firebase.remoteconfig.interop.rollouts.e eVarB = this.f124621b.b(hVar);
            for (final f fVar : this.f124623d) {
                this.f124622c.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (t unused) {
        }
    }

    public void e(@NonNull final f fVar) {
        this.f124623d.add(fVar);
        final Task<h> taskF = this.f124620a.f();
        taskF.k(this.f124622c, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.remoteconfig.internal.rollouts.b
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                e.a(this.f124613a, taskF, fVar, (h) obj);
            }
        });
    }
}
