
#ifndef __BTSTACK_CONFIG
#define __BTSTACK_CONFIG

#define EMBEDDED

#define HAVE_INIT_SCRIPT
#define HAVE_BZERO
#define HAVE_TICK

#define HAVE_EHCILL
#define HAVE_BLE

// #define ENABLE_LOG_INFO 
#define ENABLE_LOG_ERROR

#define HCI_ACL_PAYLOAD_SIZE 52

// 

#define MAX_NO_HCI_CONNECTIONS 1
#define MAX_NO_GATT_CLIENTS 0
#define MAX_NO_GATT_SUBCLIENTS 0
#define MAX_NO_L2CAP_SERVICES  0
#define MAX_NO_L2CAP_CHANNELS  0
#define MAX_NO_RFCOMM_MULTIPLEXERS 0
#define MAX_NO_RFCOMM_SERVICES 0
#define MAX_NO_RFCOMM_CHANNELS 0
#define MAX_NO_BNEP_SERVICES 0
#define MAX_NO_BNEP_CHANNELS 0
#define MAX_NO_DB_MEM_DEVICE_LINK_KEYS  2
#define MAX_NO_DB_MEM_DEVICE_NAMES 0
#define MAX_NO_DB_MEM_SERVICES 0

#endif