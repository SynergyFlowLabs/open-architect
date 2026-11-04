package com.planner5d.library.activity.fragment.list;

import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h0 implements yc.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f134058f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f134059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f134060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f134061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f134062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Date f134063e;

    public enum a {
        Unknown(0),
        Project(1),
        Snapshot(2),
        NewItem(3),
        Folders(4),
        Folder(5),
        SortingAndAppearance(6),
        AiRecognitionInProgress(7),
        AiRecognitionFailed(8),
        AddNew(9),
        Document(10),
        DocumentSynchronization(11);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134077o = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f134078a;

        a(int i10) {
            this.f134078a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f134077o;
        }

        public final int n() {
            return this.f134078a;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134079a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Folders.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Project.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Folder.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.Snapshot.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.Document.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.NewItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f134079a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    public h0(@NotNull a viewType, @NotNull Object value) {
        int iOrdinal;
        Date dateO;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f134059a = viewType;
        this.f134060b = value;
        if (value instanceof SynchronizedModel) {
            iOrdinal = ((SynchronizedModel) value).getVersion();
        } else {
            if (value instanceof com.planner5d.library.database.model.spaces.documents.a) {
                Date dateM = ((com.planner5d.library.database.model.spaces.documents.a) value).m();
                if (dateM != null) {
                    int time = (int) dateM.getTime();
                    String strT = ((com.planner5d.library.database.model.spaces.documents.a) value).t();
                    iOrdinal = time + (strT != null ? strT.hashCode() : 0);
                } else {
                    iOrdinal = 0;
                }
            } else if (value instanceof com.planner5d.library.model.g) {
                com.planner5d.library.database.model.j jVarF = ((com.planner5d.library.model.g) value).f();
                if (jVarF instanceof Folder) {
                    iOrdinal = ((Folder) ((com.planner5d.library.model.g) value).f()).getVersion();
                } else if (!(jVarF instanceof com.planner5d.library.database.model.spaces.documents.c) || (dateO = ((com.planner5d.library.database.model.spaces.documents.c) ((com.planner5d.library.model.g) value).f()).o()) == null) {
                    iOrdinal = 0;
                } else {
                    iOrdinal = (int) dateO.getTime();
                }
            } else if (value instanceof l1.g) {
                iOrdinal = ((l1.g) value).ordinal();
            } else {
                iOrdinal = 0;
            }
        }
        this.f134061c = iOrdinal;
        Date dateM2 = null;
        this.f134062d = value instanceof com.planner5d.library.model.g ? ((com.planner5d.library.model.g) value).f().getTitle() : value instanceof Project ? ((Project) value).title : value instanceof gd.b ? ((gd.b) value).getTitle() : value instanceof com.planner5d.library.database.model.spaces.documents.a ? ((com.planner5d.library.database.model.spaces.documents.a) value).q() : null;
        if (value instanceof com.planner5d.library.model.g) {
            dateM2 = ((com.planner5d.library.model.g) value).f().m();
        } else if (value instanceof Project) {
            dateM2 = ((Project) value).m();
        } else if (value instanceof gd.b) {
            dateM2 = ((gd.b) value).p();
        } else if (value instanceof com.planner5d.library.database.model.spaces.documents.a) {
            dateM2 = ((com.planner5d.library.database.model.spaces.documents.a) value).m();
        }
        this.f134063e = dateM2;
    }

    @Nullable
    public final Date a() {
        return this.f134063e;
    }

    public final long b() {
        int iOrdinal;
        Object obj = this.f134060b;
        if (obj instanceof SynchronizedModel) {
            Long id2 = ((SynchronizedModel) obj).getId();
            if (id2 != null) {
                return id2.longValue();
            }
            return 0L;
        }
        if (obj instanceof com.planner5d.library.database.model.spaces.documents.a) {
            iOrdinal = ((com.planner5d.library.database.model.spaces.documents.a) obj).o().hashCode();
        } else if (obj instanceof com.planner5d.library.model.g) {
            com.planner5d.library.database.model.j jVarF = ((com.planner5d.library.model.g) obj).f();
            if (jVarF instanceof Folder) {
                Long id3 = ((Folder) ((com.planner5d.library.model.g) this.f134060b).f()).getId();
                if (id3 != null) {
                    return id3.longValue();
                }
                return 0L;
            }
            if (!(jVarF instanceof com.planner5d.library.database.model.spaces.documents.c)) {
                return 0L;
            }
            iOrdinal = ((com.planner5d.library.database.model.spaces.documents.c) ((com.planner5d.library.model.g) this.f134060b).f()).p().hashCode();
        } else {
            iOrdinal = obj instanceof l1.g ? ((l1.g) obj).ordinal() : this.f134059a.n();
        }
        return iOrdinal;
    }

    @Nullable
    public final String c() {
        return this.f134062d;
    }

    @NotNull
    public final Object d() {
        return this.f134060b;
    }

    public final int e() {
        return this.f134061c;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(obj != null ? obj.getClass() : null, h0.class) && (obj instanceof h0)) {
            h0 h0Var = (h0) obj;
            if (h0Var.f134059a == this.f134059a && h0Var.b() == b()) {
                switch (b.f134079a[this.f134059a.ordinal()]) {
                    case 1:
                        Object obj2 = this.f134060b;
                        if (obj2 instanceof Object[]) {
                            Object obj3 = h0Var.f134060b;
                            if ((obj3 instanceof Object[]) && Arrays.equals((Object[]) obj2, (Object[]) obj3)) {
                                return true;
                            }
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return h0Var.f134061c == this.f134061c;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    @NotNull
    public final a f() {
        return this.f134059a;
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(obj != null ? obj.getClass() : null, h0.class) || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f134059a == this.f134059a && b() == h0Var.b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull Project project) {
        this(a.Project, project);
        Intrinsics.checkNotNullParameter(project, "project");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull gd.b snapshot) {
        this(a.Snapshot, snapshot);
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull com.planner5d.library.database.model.spaces.documents.a document) {
        this(a.Document, document);
        Intrinsics.checkNotNullParameter(document, "document");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull com.planner5d.library.model.g<?> folderForList) {
        this(a.Folder, folderForList);
        Intrinsics.checkNotNullParameter(folderForList, "folderForList");
    }
}
