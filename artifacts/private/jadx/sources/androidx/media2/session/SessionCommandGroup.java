package androidx.media2.session;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionCommandGroup implements androidx.versionedparcelable.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f58676r = "SessionCommandGroup";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Set<SessionCommand> f58677q;

    public SessionCommandGroup() {
        this.f58677q = new HashSet();
    }

    @NonNull
    public Set<SessionCommand> d() {
        return new HashSet(this.f58677q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.f58677q;
        if (set == null) {
            return sessionCommandGroup.f58677q == null;
        }
        return set.equals(sessionCommandGroup.f58677q);
    }

    public boolean f(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Use hasCommand(Command) for custom command");
        }
        Iterator<SessionCommand> it = this.f58677q.iterator();
        while (it.hasNext()) {
            if (it.next().d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean g(@NonNull SessionCommand sessionCommand) {
        if (sessionCommand != null) {
            return this.f58677q.contains(sessionCommand);
        }
        throw new NullPointerException("command shouldn't be null");
    }

    public int hashCode() {
        return androidx.core.util.o.c(this.f58677q);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set<SessionCommand> f58678a;

        public a() {
            this.f58678a = new HashSet();
        }

        private void i(int i10, SparseArray<List<Integer>> sparseArray) {
            for (int i11 = 0; i11 < sparseArray.size() && sparseArray.keyAt(i11) <= i10; i11++) {
                Iterator<Integer> it = sparseArray.valueAt(i11).iterator();
                while (it.hasNext()) {
                    h(new SessionCommand(it.next().intValue()));
                }
            }
        }

        @NonNull
        a a(int i10) {
            i(i10, SessionCommand.f58658g0);
            return this;
        }

        @NonNull
        a b(int i10) {
            i(i10, SessionCommand.f58670x);
            return this;
        }

        @NonNull
        a c(int i10) {
            b(i10);
            d(i10);
            return this;
        }

        @NonNull
        a d(int i10) {
            i(i10, SessionCommand.f58671y);
            return this;
        }

        @NonNull
        public a e(int i10) {
            if (i10 < 1 || i10 > 2) {
                throw new IllegalArgumentException("Unknown command version " + i10);
            }
            c(i10);
            g(i10);
            f(i10);
            a(i10);
            return this;
        }

        @NonNull
        a f(int i10) {
            i(i10, SessionCommand.Z);
            return this;
        }

        @NonNull
        a g(int i10) {
            i(i10, SessionCommand.W);
            return this;
        }

        @NonNull
        public a h(@NonNull SessionCommand sessionCommand) {
            if (sessionCommand == null) {
                throw new NullPointerException("command shouldn't be null");
            }
            this.f58678a.add(sessionCommand);
            return this;
        }

        @NonNull
        public SessionCommandGroup j() {
            return new SessionCommandGroup(this.f58678a);
        }

        @NonNull
        public a k(@NonNull SessionCommand sessionCommand) {
            if (sessionCommand == null) {
                throw new NullPointerException("command shouldn't be null");
            }
            this.f58678a.remove(sessionCommand);
            return this;
        }

        public a(@NonNull SessionCommandGroup sessionCommandGroup) {
            if (sessionCommandGroup == null) {
                throw new NullPointerException("commandGroup shouldn't be null");
            }
            this.f58678a = sessionCommandGroup.d();
        }
    }

    public SessionCommandGroup(@p0 Collection<SessionCommand> collection) {
        HashSet hashSet = new HashSet();
        this.f58677q = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
        }
    }
}
