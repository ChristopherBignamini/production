def daint = [name: 'daint',
             archs: ['gpu', 'mc'],
             cpus: ['gpu': 12, 'mc': 36],
             buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
             unusePath: '/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/tools/modules/all:/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/modules/all',
             modulesProduction: '/apps/common/UES/jenkins/production/login',
             prefixProduction: '$APPS/UES/jenkins/7.0.UP01/ARCH/easybuild']

def dom = [name: 'dom',
           archs: ['gpu', 'mc'],
           cpus: ['gpu': 12, 'mc': 36],
           buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
           unusePath: '/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/tools/modules/all:/apps/daint/UES/jenkins/7.0.UP01/ARCH/easybuild/modules/all',
           modulesProduction: '/apps/common/UES/jenkins/production/login',
           prefixProduction: '$APPS/UES/jenkins/7.0.UP01/ARCH/easybuild']

def kesch = [name: 'kesch',
             archs: [],
             cpus: 24,
             buildPath: '$XDG_RUNTIME_DIR/easybuild/build',
             unusePath: '/apps/escha/UES/easybuild/modulefiles',
             modulesProduction: '',
             prefixProduction: '/apps/escha/UES/jenkins/RH7.5/generic/easybuild']

return [daint, dom, kesch]
