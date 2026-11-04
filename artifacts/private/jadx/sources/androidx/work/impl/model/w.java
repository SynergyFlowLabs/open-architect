package androidx.work.impl.model;

import androidx.lifecycle.w0;
import androidx.room.i0;
import androidx.room.o2;
import androidx.room.u2;
import androidx.room.x0;
import androidx.work.l0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
@e.a({"UnknownNullness"})
public interface w {
    @x0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)")
    int A();

    @x0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=:id AND next_schedule_time_override_generation=:overrideGeneration)")
    void B(@NotNull String str, int i10);

    @x0("SELECT id FROM workspec")
    @NotNull
    List<String> C();

    @x0("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void D(@NotNull String str);

    @x0("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List<v> E(long j10);

    @x0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List<v> F();

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=:id")
    @o2
    @Nullable
    v.c G(@NotNull String str);

    @x0("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    v H(@NotNull String str);

    @x0("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    w0<Long> I(@NotNull String str);

    @x0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int J();

    @x0("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int K(@NotNull String str, long j10);

    @x0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<v.b> L(@NotNull String str);

    @x0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))")
    @NotNull
    List<v> M(int i10);

    @x0("UPDATE workspec SET output=:output WHERE id=:id")
    void N(@NotNull String str, @NotNull androidx.work.h hVar);

    @x0("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List<v> O();

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @o2
    @NotNull
    kotlinx.coroutines.flow.i<List<v.c>> P(@NotNull String str);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @o2
    @NotNull
    List<v.c> Q(@NotNull String str);

    @x0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int R(@NotNull String str);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @o2
    @NotNull
    List<v.c> S(@NotNull List<String> list);

    @x0("DELETE FROM workspec WHERE id=:id")
    void a(@NotNull String str);

    @x0("UPDATE workspec SET stop_reason=:stopReason WHERE id=:id")
    void b(@NotNull String str, int i10);

    @u2
    void c(@NotNull v vVar);

    @x0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void d();

    @x0("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void e(@NotNull String str);

    @i0(onConflict = 5)
    void f(@NotNull v vVar);

    @x0("UPDATE workspec SET next_schedule_time_override=:nextScheduleTimeOverrideMillis WHERE id=:id")
    void g(@NotNull String str, long j10);

    @x0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<String> h(@NotNull String str);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @o2
    @NotNull
    kotlinx.coroutines.flow.i<List<v.c>> i(@NotNull List<String> list);

    @x0("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    l0.c j(@NotNull String str);

    @x0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=:id")
    int k(@NotNull String str);

    @x0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List<String> l(@NotNull String str);

    @x0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List<androidx.work.h> m(@NotNull String str);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @o2
    @NotNull
    List<v.c> n(@NotNull String str);

    @x0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List<v> o(int i10);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @o2
    @NotNull
    kotlinx.coroutines.flow.i<List<v.c>> p(@NotNull String str);

    @x0("UPDATE workspec SET state=:state WHERE id=:id")
    int q(@NotNull l0.c cVar, @NotNull String str);

    @x0("SELECT id FROM workspec")
    @o2
    @NotNull
    w0<List<String>> r();

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @o2
    @NotNull
    w0<List<v.c>> s(@NotNull String str);

    @x0("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void t(@NotNull String str, long j10);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @o2
    @NotNull
    w0<List<v.c>> u(@NotNull String str);

    @x0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List<String> v();

    @x0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean w();

    @x0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time")
    @NotNull
    List<v> x();

    @x0("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int y(@NotNull String str);

    @x0("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @o2
    @NotNull
    w0<List<v.c>> z(@NotNull List<String> list);
}
