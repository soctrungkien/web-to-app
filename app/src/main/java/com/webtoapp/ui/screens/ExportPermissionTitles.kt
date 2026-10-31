package com.webtoapp.ui.screens

import com.webtoapp.core.i18n.AppLanguage
import com.webtoapp.core.i18n.Strings
import com.webtoapp.data.model.ExportPerm
import com.webtoapp.data.model.ExportPermGroup
import com.webtoapp.data.model.ExportPermKind

private fun t(
    zh: String,
    en: String,
    ar: String,
    pt: String,
    es: String,
    fr: String,
    de: String,
    ru: String,
    ja: String,
    ko: String,
    vi: String
): String = when (Strings.lang) {
    AppLanguage.CHINESE -> zh
    AppLanguage.ENGLISH -> en
    AppLanguage.ARABIC -> ar
    AppLanguage.PORTUGUESE -> pt
    AppLanguage.SPANISH -> es
    AppLanguage.FRENCH -> fr
    AppLanguage.GERMAN -> de
    AppLanguage.RUSSIAN -> ru
    AppLanguage.JAPANESE -> ja
    AppLanguage.KOREAN -> ko
    AppLanguage.VIETNAMESE -> vi
}

fun exportPermGroupTitle(group: ExportPermGroup): String = when (group) {
    ExportPermGroup.CALENDAR -> t("日历", "Calendar", "التقويم", "Calendário", "Calendario", "Calendrier", "Kalender", "Календарь", "カレンダー", "캘린더", "Lịch")
    ExportPermGroup.CAMERA -> t("相机", "Camera", "الكاميرا", "Câmera", "Cámara", "Caméra", "Kamera", "Камера", "カメラ", "카메라", "Máy ảnh")
    ExportPermGroup.CONTACTS -> t("通讯录", "Contacts", "جهات الاتصال", "Contatos", "Contactos", "Contacts", "Kontakte", "Контакты", "連絡先", "연락처", "Danh bạ")
    ExportPermGroup.LOCATION -> t("位置", "Location", "الموقع", "Localização", "Ubicación", "Localisation", "Standort", "Местоположение", "位置情報", "위치", "Vị trí")
    ExportPermGroup.MICROPHONE -> t("麦克风", "Microphone", "الميكروفون", "Microfone", "Micrófono", "Microphone", "Mikrofon", "Микрофон", "マイク", "마이크", "Micrô")
    ExportPermGroup.PHONE -> t("电话", "Phone", "الهاتف", "Telefone", "Teléfono", "Téléphone", "Telefon", "Телефон", "電話", "전화", "Điện thoại")
    ExportPermGroup.CALL_LOG -> t("通话记录", "Call log", "سجل المكالمات", "Registro de chamadas", "Registro de llamadas", "Journal d'appels", "Anrufliste", "Журнал звонков", "通話履歴", "통화 기록", "Nhật ký cuộc gọi")
    ExportPermGroup.ACTIVITY -> t("身体活动", "Physical activity", "النشاط البدني", "Atividade física", "Actividad física", "Activité physique", "Körperliche Aktivität", "Физическая активность", "身体活動", "신체 활동", "Hoạt động thể chất")
    ExportPermGroup.SENSORS -> t("传感器", "Sensors", "المستشعرات", "Sensores", "Sensores", "Capteurs", "Sensoren", "Датчики", "センサー", "센서", "Cảm biến")
    ExportPermGroup.SMS -> t("短信", "SMS", "الرسائل القصيرة", "SMS", "SMS", "SMS", "SMS", "SMS", "SMS", "SMS", "SMS")
    ExportPermGroup.STORAGE -> t("存储与媒体", "Storage and media", "التخزين والوسائط", "Armazenamento e mídia", "Almacenamiento y multimedia", "Stockage et médias", "Speicher und Medien", "Хранилище и медиа", "ストレージとメディア", "저장소와 미디어", "Bộ nhớ và phương tiện")
    ExportPermGroup.NEARBY -> t("附近设备与网络", "Nearby and network", "الأجهزة القريبة والشبكة", "Dispositivos próximos e rede", "Dispositivos cercanos y red", "Appareils proches et réseau", "Nahe Geräte und Netzwerk", "Ближние устройства и сеть", "近くのデバイスとネットワーク", "주변 기기와 네트워크", "Thiết bị lân cận và mạng")
    ExportPermGroup.NOTIFICATIONS -> t("通知", "Notifications", "الإشعارات", "Notificações", "Notificaciones", "Notifications", "Benachrichtigungen", "Уведомления", "通知", "알림", "Thông báo")
    ExportPermGroup.SPECIAL -> t("特殊访问", "Special access", "وصول خاص", "Acesso especial", "Acceso especial", "Accès spécial", "Sonderzugriff", "Специальный доступ", "特別なアクセス", "특수 접근", "Truy cập đặc biệt")
    ExportPermGroup.FOREGROUND -> t("前台服务", "Foreground service", "الخدمة الأمامية", "Serviço em primeiro plano", "Servicio en primer plano", "Service de premier plan", "Vordergrunddienst", "Служба переднего плана", "フォアグラウンドサービス", "포그라운드 서비스", "Dịch vụ nền trước")
    ExportPermGroup.SYSTEM -> t("系统", "System", "النظام", "Sistema", "Sistema", "Système", "System", "Система", "システム", "시스템", "Hệ thống")
}

fun exportPermissionTitle(key: String): String = when (key) {
    "READ_CALENDAR" -> t("读取日历", "Read calendar", "قراءة التقويم", "Ler calendário", "Leer calendario", "Lire le calendrier", "Kalender lesen", "Чтение календаря", "カレンダーの読み取り", "캘린더 읽기", "Đọc lịch")
    "WRITE_CALENDAR" -> t("写入日历", "Write calendar", "كتابة التقويم", "Gravar calendário", "Escribir calendario", "Modifier le calendrier", "Kalender schreiben", "Запись календаря", "カレンダーの書き込み", "캘린더 쓰기", "Ghi lịch")
    "CAMERA" -> t("相机", "Camera", "الكاميرا", "Câmera", "Cámara", "Caméra", "Kamera", "Камера", "カメラ", "카메라", "Máy ảnh")
    "READ_CONTACTS" -> t("读取通讯录", "Read contacts", "قراءة جهات الاتصال", "Ler contatos", "Leer contactos", "Lire les contacts", "Kontakte lesen", "Чтение контактов", "連絡先の読み取り", "연락처 읽기", "Đọc danh bạ")
    "WRITE_CONTACTS" -> t("写入通讯录", "Write contacts", "كتابة جهات الاتصال", "Gravar contatos", "Escribir contactos", "Modifier les contacts", "Kontakte schreiben", "Запись контактов", "連絡先の書き込み", "연락처 쓰기", "Ghi danh bạ")
    "GET_ACCOUNTS" -> t("读取账号", "Get accounts", "قراءة الحسابات", "Ler contas", "Obtener cuentas", "Lire les comptes", "Konten lesen", "Чтение аккаунтов", "アカウントの取得", "계정 읽기", "Lấy tài khoản")
    "ACCESS_COARSE_LOCATION" -> t("大致位置", "Approximate location", "الموقع التقريبي", "Localização aproximada", "Ubicación aproximada", "Position approximative", "Ungefährer Standort", "Приблизительное местоположение", "おおよその位置", "대략적 위치", "Vị trí tương đối")
    "ACCESS_FINE_LOCATION" -> t("精确位置", "Precise location", "الموقع الدقيق", "Localização precisa", "Ubicación precisa", "Position précise", "Genauer Standort", "Точное местоположение", "正確な位置", "정확한 위치", "Vị trí chính xác")
    "ACCESS_BACKGROUND_LOCATION" -> t("后台位置", "Background location", "الموقع في الخلفية", "Localização em segundo plano", "Ubicación en segundo plano", "Position en arrière-plan", "Standort im Hintergrund", "Местоположение в фоне", "バックグラウンドの位置", "백그라운드 위치", "Vị trí nền")
    "ACCESS_MEDIA_LOCATION" -> t("照片中的位置", "Location in photos", "الموقع في الصور", "Localização nas fotos", "Ubicación en fotos", "Position dans les photos", "Standort in Fotos", "Местоположение на фото", "写真の位置情報", "사진 속 위치", "Vị trí trong ảnh")
    "USE_LOCATION_BUTTON" -> t("位置按钮", "Location button", "زر الموقع", "Botão de localização", "Botón de ubicación", "Bouton de position", "Standortschaltfläche", "Кнопка местоположения", "位置情報ボタン", "위치 버튼", "Nút vị trí")
    "RECORD_AUDIO" -> t("录音", "Record audio", "تسجيل الصوت", "Gravar áudio", "Grabar audio", "Enregistrer l'audio", "Audio aufnehmen", "Запись звука", "音声の録音", "오디오 녹음", "Ghi âm")
    "MODIFY_AUDIO_SETTINGS" -> t("修改音频设置", "Modify audio settings", "تعديل إعدادات الصوت", "Modificar áudio", "Modificar audio", "Modifier l'audio", "Audioeinstellungen ändern", "Изменение звука", "音声設定の変更", "오디오 설정 변경", "Sửa cài đặt âm thanh")
    "READ_PHONE_STATE" -> t("读取电话状态", "Read phone state", "قراءة حالة الهاتف", "Ler estado do telefone", "Leer estado del teléfono", "Lire l'état du téléphone", "Telefonstatus lesen", "Чтение состояния телефона", "電話状態の読み取り", "전화 상태 읽기", "Đọc trạng thái điện thoại")
    "READ_BASIC_PHONE_STATE" -> t("读取基本电话状态", "Read basic phone state", "قراءة حالة الهاتف الأساسية", "Ler estado básico do telefone", "Leer estado básico del teléfono", "Lire l'état de base du téléphone", "Grundlegenden Telefonstatus lesen", "Базовое состояние телефона", "基本的な電話状態", "기본 전화 상태", "Đọc trạng thái điện thoại cơ bản")
    "READ_PHONE_NUMBERS" -> t("读取电话号码", "Read phone numbers", "قراءة أرقام الهاتف", "Ler números de telefone", "Leer números de teléfono", "Lire les numéros", "Telefonnummern lesen", "Чтение номеров", "電話番号の読み取り", "전화번호 읽기", "Đọc số điện thoại")
    "CALL_PHONE" -> t("拨打电话", "Call phone", "إجراء مكالمة", "Fazer chamadas", "Llamar", "Appeler", "Anrufen", "Звонки", "電話をかける", "전화 걸기", "Gọi điện")
    "ANSWER_PHONE_CALLS" -> t("接听电话", "Answer calls", "الرد على المكالمات", "Atender chamadas", "Responder llamadas", "Répondre aux appels", "Anrufe annehmen", "Ответ на звонки", "通話に応答", "전화 받기", "Nhận cuộc gọi")
    "ADD_VOICEMAIL" -> t("添加语音邮件", "Add voicemail", "إضافة البريد الصوتي", "Adicionar correio de voz", "Añadir buzón de voz", "Ajouter la messagerie", "Mailbox hinzufügen", "Добавление голосовой почты", "ボイスメールの追加", "음성사서함 추가", "Thêm hộp thư thoại")
    "USE_SIP" -> t("使用 SIP", "Use SIP", "استخدام SIP", "Usar SIP", "Usar SIP", "Utiliser SIP", "SIP verwenden", "Использовать SIP", "SIP を使用", "SIP 사용", "Dùng SIP")
    "ACCEPT_HANDOVER" -> t("接续通话", "Accept handover", "قبول تحويل المكالمة", "Aceitar transferência", "Aceptar traspaso", "Accepter le transfert", "Übergabe annehmen", "Принять передачу", "通話の引き継ぎ", "통화 전환 수락", "Chấp nhận chuyển cuộc gọi")
    "READ_CALL_LOG" -> t("读取通话记录", "Read call log", "قراءة سجل المكالمات", "Ler registro de chamadas", "Leer registro de llamadas", "Lire le journal d'appels", "Anrufliste lesen", "Чтение журнала звонков", "通話履歴の読み取り", "통화 기록 읽기", "Đọc nhật ký cuộc gọi")
    "WRITE_CALL_LOG" -> t("写入通话记录", "Write call log", "كتابة سجل المكالمات", "Gravar registro de chamadas", "Escribir registro de llamadas", "Modifier le journal d'appels", "Anrufliste schreiben", "Запись журнала звонков", "通話履歴の書き込み", "통화 기록 쓰기", "Ghi nhật ký cuộc gọi")
    "PROCESS_OUTGOING_CALLS" -> t("处理外拨电话", "Process outgoing calls", "معالجة المكالمات الصادرة", "Processar chamadas de saída", "Procesar llamadas salientes", "Traiter les appels sortants", "Ausgehende Anrufe verarbeiten", "Обработка исходящих", "発信の処理", "발신 전화 처리", "Xử lý cuộc gọi đi")
    "ACTIVITY_RECOGNITION" -> t("识别身体活动", "Recognize activity", "التعرّف على النشاط", "Reconhecer atividade", "Reconocer actividad", "Reconnaître l'activité", "Aktivität erkennen", "Распознавание активности", "身体活動の認識", "신체 활동 인식", "Nhận diện hoạt động")
    "BODY_SENSORS" -> t("身体传感器", "Body sensors", "مستشعرات الجسم", "Sensores corporais", "Sensores corporales", "Capteurs corporels", "Körpersensoren", "Датчики тела", "ボディセンサー", "신체 센서", "Cảm biến cơ thể")
    "BODY_SENSORS_BACKGROUND" -> t("后台身体传感器", "Background body sensors", "مستشعرات الجسم في الخلفية", "Sensores corporais em segundo plano", "Sensores corporales en segundo plano", "Capteurs corporels en arrière-plan", "Körpersensoren im Hintergrund", "Датчики тела в фоне", "バックグラウンドのボディセンサー", "백그라운드 신체 센서", "Cảm biến cơ thể nền")
    "HIGH_SAMPLING_RATE_SENSORS" -> t("高采样率传感器", "High-rate sensors", "مستشعرات بمعدل عالٍ", "Sensores de alta taxa", "Sensores de alta frecuencia", "Capteurs haute fréquence", "Sensoren mit hoher Rate", "Датчики с высокой частотой", "高サンプリングセンサー", "고속 샘플링 센서", "Cảm biến tần số cao")
    "SEND_SMS" -> t("发送短信", "Send SMS", "إرسال الرسائل", "Enviar SMS", "Enviar SMS", "Envoyer des SMS", "SMS senden", "Отправка SMS", "SMS の送信", "SMS 보내기", "Gửi SMS")
    "RECEIVE_SMS" -> t("接收短信", "Receive SMS", "استلام الرسائل", "Receber SMS", "Recibir SMS", "Recevoir des SMS", "SMS empfangen", "Получение SMS", "SMS の受信", "SMS 받기", "Nhận SMS")
    "READ_SMS" -> t("读取短信", "Read SMS", "قراءة الرسائل", "Ler SMS", "Leer SMS", "Lire les SMS", "SMS lesen", "Чтение SMS", "SMS の読み取り", "SMS 읽기", "Đọc SMS")
    "RECEIVE_WAP_PUSH" -> t("接收 WAP 推送", "Receive WAP push", "استلام WAP", "Receber WAP push", "Recibir WAP push", "Recevoir le WAP push", "WAP-Push empfangen", "Получение WAP", "WAP プッシュの受信", "WAP 푸시 수신", "Nhận WAP push")
    "RECEIVE_MMS" -> t("接收彩信", "Receive MMS", "استلام MMS", "Receber MMS", "Recibir MMS", "Recevoir des MMS", "MMS empfangen", "Получение MMS", "MMS の受信", "MMS 받기", "Nhận MMS")
    "READ_EXTERNAL_STORAGE" -> t("读取外部存储", "Read external storage", "قراءة التخزين الخارجي", "Ler armazenamento externo", "Leer almacenamiento externo", "Lire le stockage externe", "Externen Speicher lesen", "Чтение внешнего хранилища", "外部ストレージの読み取り", "외부 저장소 읽기", "Đọc bộ nhớ ngoài")
    "WRITE_EXTERNAL_STORAGE" -> t("写入外部存储", "Write external storage", "كتابة التخزين الخارجي", "Gravar armazenamento externo", "Escribir almacenamiento externo", "Écrire le stockage externe", "Externen Speicher schreiben", "Запись во внешнее хранилище", "外部ストレージへの書き込み", "외부 저장소 쓰기", "Ghi bộ nhớ ngoài")
    "READ_MEDIA_IMAGES" -> t("读取图片", "Read images", "قراءة الصور", "Ler imagens", "Leer imágenes", "Lire les images", "Bilder lesen", "Чтение изображений", "画像の読み取り", "이미지 읽기", "Đọc hình ảnh")
    "READ_MEDIA_VIDEO" -> t("读取视频", "Read videos", "قراءة الفيديو", "Ler vídeos", "Leer vídeos", "Lire les vidéos", "Videos lesen", "Чтение видео", "動画の読み取り", "동영상 읽기", "Đọc video")
    "READ_MEDIA_AUDIO" -> t("读取音频", "Read audio", "قراءة الصوت", "Ler áudio", "Leer audio", "Lire l'audio", "Audio lesen", "Чтение аудио", "音声ファイルの読み取り", "오디오 파일 읽기", "Đọc âm thanh")
    "READ_MEDIA_VISUAL_USER_SELECTED" -> t("用户选择的照片和视频", "User-selected photos and videos", "صور وفيديو يختارها المستخدم", "Fotos e vídeos escolhidos", "Fotos y vídeos elegidos", "Photos et vidéos choisies", "Ausgewählte Fotos und Videos", "Выбранные фото и видео", "ユーザーが選んだ写真と動画", "사용자가 선택한 사진과 동영상", "Ảnh và video do người dùng chọn")
    "MANAGE_EXTERNAL_STORAGE" -> t("所有文件访问", "All files access", "الوصول إلى كل الملفات", "Acesso a todos os arquivos", "Acceso a todos los archivos", "Accès à tous les fichiers", "Zugriff auf alle Dateien", "Доступ ко всем файлам", "すべてのファイルへのアクセス", "모든 파일 접근", "Truy cập mọi tệp")
    "BLUETOOTH" -> t("蓝牙", "Bluetooth", "البلوتوث", "Bluetooth", "Bluetooth", "Bluetooth", "Bluetooth", "Bluetooth", "Bluetooth", "블루투스", "Bluetooth")
    "BLUETOOTH_ADMIN" -> t("管理蓝牙", "Bluetooth admin", "إدارة البلوتوث", "Administrar Bluetooth", "Administrar Bluetooth", "Administrer Bluetooth", "Bluetooth verwalten", "Управление Bluetooth", "Bluetooth の管理", "블루투스 관리", "Quản trị Bluetooth")
    "BLUETOOTH_SCAN" -> t("扫描蓝牙", "Scan Bluetooth", "البحث عن بلوتوث", "Procurar Bluetooth", "Buscar Bluetooth", "Rechercher Bluetooth", "Bluetooth suchen", "Поиск Bluetooth", "Bluetooth のスキャン", "블루투스 검색", "Quét Bluetooth")
    "BLUETOOTH_CONNECT" -> t("连接蓝牙", "Connect Bluetooth", "الاتصال بالبلوتوث", "Conectar Bluetooth", "Conectar Bluetooth", "Connecter Bluetooth", "Bluetooth verbinden", "Подключение Bluetooth", "Bluetooth の接続", "블루투스 연결", "Kết nối Bluetooth")
    "BLUETOOTH_ADVERTISE" -> t("蓝牙广播", "Bluetooth advertise", "إعلان البلوتوث", "Anunciar Bluetooth", "Anunciar Bluetooth", "Diffuser Bluetooth", "Bluetooth ankündigen", "Объявление Bluetooth", "Bluetooth のアドバタイズ", "블루투스 광고", "Quảng bá Bluetooth")
    "UWB_RANGING" -> t("超宽带测距", "UWB ranging", "قياس UWB", "Medição UWB", "Medición UWB", "Mesure UWB", "UWB-Entfernung", "Дальность UWB", "UWB 測距", "UWB 거리 측정", "Đo khoảng cách UWB")
    "NEARBY_WIFI_DEVICES" -> t("附近的 Wi-Fi 设备", "Nearby Wi-Fi devices", "أجهزة Wi-Fi القريبة", "Dispositivos Wi-Fi próximos", "Dispositivos Wi-Fi cercanos", "Appareils Wi-Fi proches", "Nahe WLAN-Geräte", "Ближние устройства Wi-Fi", "近くの Wi-Fi デバイス", "주변 Wi-Fi 기기", "Thiết bị Wi-Fi lân cận")
    "RANGING" -> t("测距", "Ranging", "قياس المسافة", "Medição de distância", "Medición de distancia", "Mesure de distance", "Entfernungsmessung", "Измерение расстояния", "測距", "거리 측정", "Đo khoảng cách")
    "NFC" -> t("NFC", "NFC", "NFC", "NFC", "NFC", "NFC", "NFC", "NFC", "NFC", "NFC", "NFC")
    "ACCESS_LOCAL_NETWORK" -> t("局域网", "Local network", "الشبكة المحلية", "Rede local", "Red local", "Réseau local", "Lokales Netzwerk", "Локальная сеть", "ローカルネットワーク", "로컬 네트워크", "Mạng cục bộ")
    "POST_NOTIFICATIONS" -> t("发布通知", "Post notifications", "إرسال الإشعارات", "Publicar notificações", "Publicar notificaciones", "Publier des notifications", "Benachrichtigungen senden", "Публикация уведомлений", "通知の投稿", "알림 게시", "Gửi thông báo")
    "POST_PROMOTED_NOTIFICATIONS" -> t("推广通知", "Promoted notifications", "الإشعارات المروَّجة", "Notificações promovidas", "Notificaciones promocionadas", "Notifications promues", "Hervorgehobene Benachrichtigungen", "Продвигаемые уведомления", "プロモート通知", "프로모션 알림", "Thông báo quảng bá")
    "USE_FULL_SCREEN_INTENT" -> t("全屏意图", "Full-screen intent", "النية بملء الشاشة", "Intenção em tela cheia", "Intención a pantalla completa", "Intention plein écran", "Vollbild-Intent", "Полноэкранное намерение", "全画面インテント", "전체 화면 인텐트", "Intent toàn màn hình")
    "ACCESS_NOTIFICATION_POLICY" -> t("勿扰策略", "Do Not Disturb policy", "سياسة عدم الإزعاج", "Política Não perturbe", "Política No molestar", "Politique Ne pas déranger", "Bitte-nicht-stören-Richtlinie", "Политика «Не беспокоить»", "サイレントモードのポリシー", "방해 금지 정책", "Chính sách Không làm phiền")
    "SYSTEM_ALERT_WINDOW" -> t("显示在其他应用上层", "Draw over other apps", "الظهور فوق التطبيقات", "Sobrepor a outros apps", "Mostrar sobre otras apps", "Afficher par-dessus", "Über anderen Apps einblenden", "Поверх других приложений", "他のアプリの上に表示", "다른 앱 위에 표시", "Hiển thị trên ứng dụng khác")
    "WRITE_SETTINGS" -> t("修改系统设置", "Modify system settings", "تعديل إعدادات النظام", "Modificar configurações do sistema", "Modificar ajustes del sistema", "Modifier les paramètres système", "Systemeinstellungen ändern", "Изменение системных настроек", "システム設定の変更", "시스템 설정 수정", "Sửa cài đặt hệ thống")
    "REQUEST_INSTALL_PACKAGES" -> t("安装未知应用", "Install unknown apps", "تثبيت تطبيقات غير معروفة", "Instalar apps desconhecidos", "Instalar apps desconocidas", "Installer des apps inconnues", "Unbekannte Apps installieren", "Установка неизвестных приложений", "不明なアプリのインストール", "알 수 없는 앱 설치", "Cài ứng dụng không rõ nguồn gốc")
    "PACKAGE_USAGE_STATS" -> t("使用情况访问", "Usage access", "الوصول إلى الاستخدام", "Acesso de uso", "Acceso de uso", "Accès à l'utilisation", "Nutzungszugriff", "Доступ к использованию", "使用状況へのアクセス", "사용 정보 접근", "Truy cập dữ liệu sử dụng")
    "SCHEDULE_EXACT_ALARM" -> t("精确闹钟", "Exact alarms", "المنبهات الدقيقة", "Alarmes exatos", "Alarmas exactas", "Alarmes exactes", "Genaue Alarme", "Точные будильники", "正確なアラーム", "정확한 알람", "Báo thức chính xác")
    "USE_EXACT_ALARM" -> t("使用精确闹钟", "Use exact alarms", "استخدام المنبهات الدقيقة", "Usar alarmes exatos", "Usar alarmas exactas", "Utiliser les alarmes exactes", "Genaue Alarme verwenden", "Использовать точные будильники", "正確なアラームを使用", "정확한 알람 사용", "Dùng báo thức chính xác")
    "REQUEST_IGNORE_BATTERY_OPTIMIZATIONS" -> t("忽略电池优化", "Ignore battery optimizations", "تجاهل تحسين البطارية", "Ignorar otimização da bateria", "Ignorar optimización de batería", "Ignorer l'optimisation batterie", "Akkuoptimierung ignorieren", "Игнорировать оптимизацию батареи", "バッテリー最適化を無視", "배터리 최적화 무시", "Bỏ qua tối ưu pin")
    "QUERY_ALL_PACKAGES" -> t("读取应用列表", "Installed app list", "قائمة التطبيقات المثبتة", "Lista de apps instalados", "Lista de apps instaladas", "Liste des apps installées", "Liste installierter Apps", "Список установленных приложений", "インストール済みアプリ一覧", "설치된 앱 목록", "Danh sách ứng dụng đã cài")
    "FOREGROUND_SERVICE" -> t("前台服务", "Foreground service", "الخدمة الأمامية", "Serviço em primeiro plano", "Servicio en primer plano", "Service de premier plan", "Vordergrunddienst", "Служба переднего плана", "フォアグラウンドサービス", "포그라운드 서비스", "Dịch vụ nền trước")
    "FOREGROUND_SERVICE_SPECIAL_USE" -> t("前台服务：特殊用途", "Foreground: special use", "أمامية: استخدام خاص", "Primeiro plano: uso especial", "Primer plano: uso especial", "Premier plan : usage spécial", "Vordergrund: Sondernutzung", "Передний план: особый", "フォアグラウンド：特別な用途", "포그라운드: 특수 용도", "Nền trước: mục đích đặc biệt")
    "FOREGROUND_SERVICE_DATA_SYNC" -> t("前台服务：数据同步", "Foreground: data sync", "أمامية: مزامنة البيانات", "Primeiro plano: sincronização", "Primer plano: sincronización", "Premier plan : synchro", "Vordergrund: Datensync", "Передний план: синхронизация", "フォアグラウンド：データ同期", "포그라운드: 데이터 동기화", "Nền trước: đồng bộ dữ liệu")
    "FOREGROUND_SERVICE_MEDIA_PLAYBACK" -> t("前台服务：媒体播放", "Foreground: media playback", "أمامية: تشغيل الوسائط", "Primeiro plano: mídia", "Primer plano: multimedia", "Premier plan : média", "Vordergrund: Medienwiedergabe", "Передний план: медиа", "フォアグラウンド：メディア再生", "포그라운드: 미디어 재생", "Nền trước: phát phương tiện")
    "FOREGROUND_SERVICE_LOCATION" -> t("前台服务：位置", "Foreground: location", "أمامية: الموقع", "Primeiro plano: localização", "Primer plano: ubicación", "Premier plan : position", "Vordergrund: Standort", "Передний план: местоположение", "フォアグラウンド：位置情報", "포그라운드: 위치", "Nền trước: vị trí")
    "FOREGROUND_SERVICE_CAMERA" -> t("前台服务：相机", "Foreground: camera", "أمامية: الكاميرا", "Primeiro plano: câmera", "Primer plano: cámara", "Premier plan : caméra", "Vordergrund: Kamera", "Передний план: камера", "フォアグラウンド：カメラ", "포그라운드: 카메라", "Nền trước: máy ảnh")
    "FOREGROUND_SERVICE_MICROPHONE" -> t("前台服务：麦克风", "Foreground: microphone", "أمامية: الميكروفون", "Primeiro plano: microfone", "Primer plano: micrófono", "Premier plan : micro", "Vordergrund: Mikrofon", "Передний план: микрофон", "フォアグラウンド：マイク", "포그라운드: 마이크", "Nền trước: micrô")
    "FOREGROUND_SERVICE_CONNECTED_DEVICE" -> t("前台服务：已连接设备", "Foreground: connected device", "أمامية: جهاز متصل", "Primeiro plano: dispositivo conectado", "Primer plano: dispositivo conectado", "Premier plan : appareil connecté", "Vordergrund: verbundenes Gerät", "Передний план: устройство", "フォアグラウンド：接続デバイス", "포그라운드: 연결된 기기", "Nền trước: thiết bị kết nối")
    "FOREGROUND_SERVICE_MEDIA_PROJECTION" -> t("前台服务：媒体投影", "Foreground: media projection", "أمامية: عرض الوسائط", "Primeiro plano: projeção de mídia", "Primer plano: proyección", "Premier plan : projection", "Vordergrund: Medienprojektion", "Передний план: проекция", "フォアグラウンド：メディア投影", "포그라운드: 미디어 프로젝션", "Nền trước: chiếu phương tiện")
    "FOREGROUND_SERVICE_PHONE_CALL" -> t("前台服务：通话", "Foreground: phone call", "أمامية: مكالمة", "Primeiro plano: chamada", "Primer plano: llamada", "Premier plan : appel", "Vordergrund: Anruf", "Передний план: звонок", "フォアグラウンド：通話", "포그라운드: 통화", "Nền trước: cuộc gọi")
    "FOREGROUND_SERVICE_HEALTH" -> t("前台服务：健康", "Foreground: health", "أمامية: الصحة", "Primeiro plano: saúde", "Primer plano: salud", "Premier plan : santé", "Vordergrund: Gesundheit", "Передний план: здоровье", "フォアグラウンド：ヘルスケア", "포그라운드: 건강", "Nền trước: sức khỏe")
    "FOREGROUND_SERVICE_REMOTE_MESSAGING" -> t("前台服务：远程消息", "Foreground: remote messaging", "أمامية: الرسائل البعيدة", "Primeiro plano: mensagens remotas", "Primer plano: mensajería remota", "Premier plan : messages distants", "Vordergrund: Nachrichten", "Передний план: сообщения", "フォアグラウンド：リモートメッセージ", "포그라운드: 원격 메시지", "Nền trước: tin nhắn từ xa")
    "FOREGROUND_SERVICE_SYSTEM_EXEMPTED" -> t("前台服务：系统豁免", "Foreground: system exempted", "أمامية: إعفاء النظام", "Primeiro plano: isento do sistema", "Primer plano: exento del sistema", "Premier plan : exemption système", "Vordergrund: Systemausnahme", "Передний план: исключение", "フォアグラウンド：システム免除", "포그라운드: 시스템 예외", "Nền trước: hệ thống miễn trừ")
    "FOREGROUND_SERVICE_MEDIA_PROCESSING" -> t("前台服务：媒体处理", "Foreground: media processing", "أمامية: معالجة الوسائط", "Primeiro plano: processamento de mídia", "Primer plano: procesamiento", "Premier plan : traitement média", "Vordergrund: Medienverarbeitung", "Передний план: обработка медиа", "フォアグラウンド：メディア処理", "포그라운드: 미디어 처리", "Nền trước: xử lý phương tiện")
    "WAKE_LOCK" -> t("唤醒锁", "Wake lock", "قفل الإيقاظ", "Wake lock", "Bloqueo de activación", "Verrou de réveil", "Wakelock", "Блокировка пробуждения", "スリープ解除ロック", "화면 꺼짐 방지", "Khóa đánh thức")
    "RECEIVE_BOOT_COMPLETED" -> t("开机完成", "Boot completed", "اكتمال الإقلاع", "Inicialização concluída", "Arranque completado", "Démarrage terminé", "Start abgeschlossen", "Загрузка завершена", "起動完了", "부팅 완료", "Khởi động xong")
    "VIBRATE" -> t("振动", "Vibrate", "الاهتزاز", "Vibrar", "Vibrar", "Vibrer", "Vibrieren", "Вибрация", "バイブ", "진동", "Rung")
    "REQUEST_DELETE_PACKAGES" -> t("请求卸载应用", "Request app uninstall", "طلب إلغاء التثبيت", "Pedir desinstalação", "Solicitar desinstalación", "Demander la désinstallation", "Deinstallation anfragen", "Запрос удаления", "アンインストールの要求", "앱 삭제 요청", "Yêu cầu gỡ ứng dụng")
    "USE_BIOMETRIC" -> t("生物识别", "Biometrics", "القياسات الحيوية", "Biometria", "Biometría", "Biométrie", "Biometrie", "Биометрия", "生体認証", "생체 인식", "Sinh trắc học")
    "USE_FINGERPRINT" -> t("指纹", "Fingerprint", "بصمة الإصبع", "Impressão digital", "Huella", "Empreinte", "Fingerabdruck", "Отпечаток", "指紋", "지문", "Vân tay")
    "DETECT_SCREEN_CAPTURE" -> t("检测截屏", "Detect screenshots", "اكتشاف لقطات الشاشة", "Detectar capturas", "Detectar capturas", "Détecter les captures", "Screenshots erkennen", "Обнаружение скриншотов", "スクリーンショットの検出", "스크린샷 감지", "Phát hiện ảnh chụp màn hình")
    "DETECT_SCREEN_RECORDING" -> t("检测录屏", "Detect screen recording", "اكتشاف تسجيل الشاشة", "Detectar gravação de tela", "Detectar grabación", "Détecter l'enregistrement", "Bildschirmaufnahme erkennen", "Обнаружение записи экрана", "画面録画の検出", "화면 녹화 감지", "Phát hiện quay màn hình")
    "ACCESS_WIFI_STATE" -> t("读取 Wi-Fi 状态", "Read Wi-Fi state", "قراءة حالة Wi-Fi", "Ler estado do Wi-Fi", "Leer estado del Wi-Fi", "Lire l'état Wi-Fi", "WLAN-Status lesen", "Чтение состояния Wi-Fi", "Wi-Fi 状態の読み取り", "Wi-Fi 상태 읽기", "Đọc trạng thái Wi-Fi")
    "CHANGE_WIFI_STATE" -> t("更改 Wi-Fi 状态", "Change Wi-Fi state", "تغيير حالة Wi-Fi", "Alterar estado do Wi-Fi", "Cambiar estado del Wi-Fi", "Modifier l'état Wi-Fi", "WLAN-Status ändern", "Изменение Wi-Fi", "Wi-Fi 状態の変更", "Wi-Fi 상태 변경", "Đổi trạng thái Wi-Fi")
    "CHANGE_NETWORK_STATE" -> t("更改网络状态", "Change network state", "تغيير حالة الشبكة", "Alterar estado da rede", "Cambiar estado de la red", "Modifier l'état du réseau", "Netzwerkstatus ändern", "Изменение сети", "ネットワーク状態の変更", "네트워크 상태 변경", "Đổi trạng thái mạng")
    else -> key
}

fun exportPermKindLabel(kind: ExportPermKind): String = when (kind) {
    ExportPermKind.DANGEROUS -> t(
        "危险，运行时弹窗",
        "Dangerous, runtime prompt",
        "خطير، نافذة وقت التشغيل",
        "Perigoso, pedido em tempo de execução",
        "Peligroso, aviso en tiempo de ejecución",
        "Dangereux, invite à l'exécution",
        "Gefährlich, Laufzeitdialog",
        "Опасное, запрос при запуске",
        "危険、実行時に確認",
        "위험, 실행 중 프롬프트",
        "Nguy hiểm, hỏi khi chạy"
    )
    ExportPermKind.SPECIAL -> t(
        "特殊，到系统设置里打开",
        "Special, grant in Settings",
        "خاص، يُمنح من الإعدادات",
        "Especial, conceder em Configurações",
        "Especial, conceder en Ajustes",
        "Spécial, accorder dans Réglages",
        "Speziell, in den Einstellungen",
        "Особое, в настройках",
        "特別、設定で許可",
        "특수, 설정에서 허용",
        "Đặc biệt, cấp trong Cài đặt"
    )
    ExportPermKind.NORMAL -> t(
        "普通，安装即授予，没有弹窗",
        "Normal, granted at install, no prompt",
        "عادي، يُمنح عند التثبيت بلا نافذة",
        "Normal, concedido na instalação, sem aviso",
        "Normal, se concede al instalar, sin aviso",
        "Normal, accordé à l'installation, sans invite",
        "Normal, bei Installation, kein Dialog",
        "Обычное, при установке, без запроса",
        "通常、インストール時に付与、確認なし",
        "일반, 설치 시 부여, 프롬프트 없음",
        "Thường, cấp khi cài, không hỏi"
    )
}

fun exportPermApiAdded(api: Int): String = t(
    "API $api 引入",
    "Added in API $api",
    "أُضيف في API $api",
    "Adicionado na API $api",
    "Añadido en API $api",
    "Ajouté à l'API $api",
    "Seit API $api",
    "Добавлено в API $api",
    "API $api で追加",
    "API ${api}에 추가",
    "Thêm từ API $api"
)

fun exportPermDeprecated(api: Int): String = t(
    "API $api 起废弃，之后不再弹窗",
    "Deprecated in API $api, not requested after that",
    "أُهمل في API $api ولن يُطلب بعده",
    "Obsoleto na API $api, sem pedido depois",
    "Obsoleto en API $api, no se pide después",
    "Obsolète à l'API $api, plus demandé ensuite",
    "Veraltet ab API $api, danach kein Dialog",
    "Устарело в API $api, дальше не запрашивается",
    "API $api で非推奨、それ以降は確認しない",
    "API ${api}부터 지원 중단, 이후 요청 안 함",
    "Không dùng từ API $api, sau đó không yêu cầu"
)

fun exportPermRequestFrom(api: Int): String = t(
    "从 API $api 起才请求",
    "Requested from API $api",
    "يُطلب من API $api",
    "Pedido a partir da API $api",
    "Se pide desde API $api",
    "Demandé à partir de l'API $api",
    "Angefragt ab API $api",
    "Запрос с API $api",
    "API $api からリクエスト",
    "API ${api}부터 요청",
    "Yêu cầu từ API $api"
)

fun exportPermRequestUntil(api: Int): String = t(
    "API $api 起不再请求",
    "Not requested from API $api",
    "لا يُطلب من API $api",
    "Não pedido a partir da API $api",
    "No se pide desde API $api",
    "Plus demandé dès l'API $api",
    "Nicht mehr ab API $api",
    "Не запрашивается с API $api",
    "API $api 以降はリクエストしない",
    "API ${api}부터 요청 안 함",
    "Không yêu cầu từ API $api"
)

fun exportPermPlayMark(): String = t(
    "Play 受限",
    "Play-restricted",
    "مقيّد في Play",
    "Restrito na Play",
    "Restringido en Play",
    "Restreint sur Play",
    "Play-eingeschränkt",
    "Ограничено Play",
    "Play 制限",
    "Play 제한",
    "Giới hạn bởi Play"
)

fun exportPermSearchEmpty(): String = t(
    "没有匹配的权限",
    "No matching permission",
    "لا يوجد إذن مطابق",
    "Nenhuma permissão correspondente",
    "Ningún permiso coincidente",
    "Aucune permission correspondante",
    "Keine passende Berechtigung",
    "Нет подходящего разрешения",
    "一致する権限がありません",
    "일치하는 권한 없음",
    "Không có quyền phù hợp"
)

/** Manifest name, API, and kind. This is the row's identity and stays visible. */
fun exportPermissionIdentity(perm: ExportPerm): String = buildString {
    append(perm.manifest)
    append(" · ")
    append(exportPermApiAdded(perm.addedApi))
    append(" · ")
    append(exportPermKindLabel(perm.kind))
    perm.deprecatedApi?.let {
        append(" · ")
        append(exportPermDeprecated(it))
    }
    if (perm.requestFromApi != null && perm.requestFromApi != perm.addedApi) {
        append(" · ")
        append(exportPermRequestFrom(perm.requestFromApi))
    }
    if (perm.requestUntilApi != null && perm.requestUntilApi != perm.deprecatedApi) {
        append(" · ")
        append(exportPermRequestUntil(perm.requestUntilApi))
    }
    if (perm.playRestricted) {
        append(" · ")
        append(exportPermPlayMark())
    }
}
