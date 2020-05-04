{{/* vim: set filetype=mustache: */}}

{{- define "apps.jvm.args" }}
{{- join "," .Values.apps.jvm.args }}
{{- end }}

{{- define "aps.mount.conf.prod" -}}
{{- printf "%s/%s" .Values.apps.conf.path .Values.apps.conf.file }}
{{- end }}

{{- define "pods.master.image" -}}
{{- printf "%s:%s" .Values.pods.master.repository .Values.pods.master.appVersion }}
{{- end }}

{{- define "pods.slave.image" -}}
{{- printf "%s:%s" .Values.pods.slave.repository .Values.pods.slave.appVersion }}
{{- end }}
